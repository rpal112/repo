package model.callback;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by rpal on 5/26/2014.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CallbackResult {

    private List<TvRage> content;

    public CallbackResult(List<TvRage> content) {
        this.content = content;
    }

    public List<TvRage> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "CallbackResult{" +
                "content=" + content +
                '}';
    }
}

