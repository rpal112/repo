package model.callback;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by rpal on 5/26/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Akas {

    @JsonProperty("aka")
    private List<Aka> aka;

    public List<Aka> getAka() {
        return aka;
    }

    public void setAka(List<Aka> aka) {
        this.aka = aka;
    }

    @Override
    public String toString() {
        return "Akas{" +
                "aka=" + aka +
                '}';
    }
}