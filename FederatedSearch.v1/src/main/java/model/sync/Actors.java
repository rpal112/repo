package model.sync;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/23/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Actors {

    @JsonProperty("name")
    private String name;

    @Override
    public String toString() {
        return "Actors {"
                + "name =" + getName()+ " "
                + '\''
                + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
