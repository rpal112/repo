package restClients;

import com.springapp.mvc.Query;
import model.callback.TvRage;
import model.callback.TvRageTemp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rpal on 5/26/2014.
 */
public class CallbackRestClient extends Thread{
    private RestTemplate restTemplate;

//    Query query;
//    public void callbackgQuery(Query query){
//        this.query = query;
//    }

    String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }



    @Override
    public void run() {

        RestTemplate restTemplate = new RestTemplate();
        //ResponseEntity<TvRageTemp> responseEntity;


        String providerUrl = "http://localhost:8083/tvrage/query/"+ query +
                "?callback=http://localhost:8080/tvrage/callback";

        System.out.println("callback response code: " +
                restTemplate.getForEntity(providerUrl, TvRageTemp.class).getStatusCode());


    }

}
