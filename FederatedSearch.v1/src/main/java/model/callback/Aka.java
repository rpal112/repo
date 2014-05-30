package model.callback;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/26/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Aka {

    @JsonProperty("content")
    private String content;

    @JsonProperty("country")
    private String country;

    @JsonProperty("attr")
    private Object attr;

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

    public Object getAttr() {
        return attr;
    }

    public void setAttr(Object attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "Aka{" +
                "content='" + content + '\'' +
                ", country='" + country + '\'' +
                ", attr=" + attr +
                '}';
    }
}