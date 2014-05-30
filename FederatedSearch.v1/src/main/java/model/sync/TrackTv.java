package model.sync;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by rpal on 5/23/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class TrackTv {

    @JsonProperty("noEntries")
    private String noEntities;

    @JsonProperty("content")
    private
    List<Content> contentEntryList;

    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getNoEntities() {
        return noEntities;
    }

    public void setNoEntities(String noEntities) {
        this.noEntities = noEntities;
    }


    public List<Content> getContentEntryList() {
        return contentEntryList;
    }

    public void setContentEntryList(List<Content> contentEntryList) {
        this.contentEntryList = contentEntryList;
    }

    @Override
    public String toString() {
        return "TrackTv {"
                + "noEntities =" + getNoEntities()+ " "
                + "content =" + getContentEntryList()+ " "
                + '\''
                + '}';
    }

}
