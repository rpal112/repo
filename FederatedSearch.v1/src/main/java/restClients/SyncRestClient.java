package restClients;

import model.sync.TrackTv;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by rpal on 5/23/2014.
 */
@Controller
public class SyncRestClient {

    ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private RestTemplate restTemplate;

    private String syncUrl = "http://localhost:8082/tracktv?query=";
    private String searchUrl;
    private String json;
    private byte jsonBytes[];
    private String data;


    public TrackTv query(String query) throws IOException {
        searchUrl = syncUrl + query;
        json = restTemplate.getForObject(searchUrl, String.class);
        jsonBytes = json.getBytes();
        try {
            data = new String(jsonBytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        TrackTv trackTvResult = mapper.readValue(data, TrackTv.class);

        return trackTvResult;

    }

}


