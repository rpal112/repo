package model.pooling;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/23/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ImdbTempUrl {

    @JsonProperty("message")
    private String message;

    @JsonProperty("detail")
    private String detail;

    @Override
    public String toString() {
        return "Temp {"
                + "message = " + getMessage()+ " "
                + "detail = " + getDetail()+ " "

                + "}";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
