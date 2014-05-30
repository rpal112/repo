package model.callback;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/27/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TvRageTemp {

    @JsonProperty("message")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TvRageTemp{" +
                "content='" + content + '\'' +
                '}';
    }
}
