package model.sync;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by rpal on 5/23/2014.
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class People {

    @JsonProperty("actors")
    private
    List<Actors> actorsList;

    @Override
    public String toString() {
        return "Actors {"
                + "actors =" + getActorsList()+ " "
                + '\''
                + '}';
    }


    public List<Actors> getActorsList() {
        return actorsList;
    }

    public void setActorsList(List<Actors> actorsList) {
        this.actorsList = actorsList;
    }
}
