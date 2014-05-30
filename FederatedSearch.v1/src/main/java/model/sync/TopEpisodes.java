package model.sync;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/23/2014.
 */
public class TopEpisodes {

    @JsonProperty("plays")
    private String plays;

    @JsonProperty("season")
    private String season;

    @JsonProperty("number")
    private String number;

    @JsonProperty("title")
    private String title;

    @JsonProperty("url")
    private String url;

    @Override
    public String toString() {
        return "TopEpisodes {"
                + "plays =" + getPlays()+ " "
                + "season =" + getSeason()+ " "
                + "number =" + getNumber()+ " "
                + "title =" + getTitle()+ " "
                + "url =" + getUrl()+ " "
                + '\''
                + '}';
    }

    public String getPlays() {
        return plays;
    }

    public void setPlays(String plays) {
        this.plays = plays;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
