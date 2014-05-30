package model.callback;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/26/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Network {

    @JsonProperty("content")
    private String content;

    @JsonProperty("country")
    private String country;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Network{" +
                "content='" + content + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}