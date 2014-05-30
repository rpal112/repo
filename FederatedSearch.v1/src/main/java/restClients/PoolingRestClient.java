package restClients;

import model.pooling.Imdb;
import model.pooling.ImdbTempUrl;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rpal on 5/23/2014.
 */
public class PoolingRestClient {

    ObjectMapper mapper = new ObjectMapper();
    ResponseEntity<?> responseEntity;
    ImdbTempUrl imdbTempUrl;
    HttpStatus httpStatus;

    @Autowired
    private RestTemplate restTemplate;

    private String poolingUrl = "http://localhost:8081/movies/";
    private String json;
    private byte jsonBytes[];
    private String data;



    public List<Imdb> query(String query) throws IOException {
        String searchUrl = poolingUrl + query;
        json = restTemplate.getForObject(searchUrl, String.class);
        jsonBytes = json.getBytes();
        try {
            data = new String(jsonBytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            imdbTempUrl = mapper.readValue(data, ImdbTempUrl.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        responseEntity = restTemplate.getForEntity(searchUrl, ImdbTempUrl.class);
        httpStatus = responseEntity.getStatusCode();

        while (!httpStatus.name().equals("OK")) {
            responseEntity = restTemplate.getForEntity(imdbTempUrl.getDetail(), String.class);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            httpStatus = responseEntity.getStatusCode();

        }
        jsonBytes = responseEntity.getBody().toString().getBytes();
        data = new String(jsonBytes, "UTF-8");
        Imdb[] imdbArray = mapper.readValue(data,Imdb[].class);
        List<Imdb> poolingResult = Arrays.asList(imdbArray);

        return poolingResult;
    }



}
