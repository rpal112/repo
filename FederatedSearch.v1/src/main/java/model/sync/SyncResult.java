package model.sync;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by rpal on 5/27/2014.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyncResult {

    private List<TrackTv> content;

    public SyncResult(List<TrackTv> content) {
        this.content = content;
    }

    public List<TrackTv> getContent() {
        return content;
    }

    public void setContent(List<TrackTv> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SyncResult{" +
                "content=" + content +
                '}';
    }
}
