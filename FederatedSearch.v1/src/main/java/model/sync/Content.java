package model.sync;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by rpal on 5/23/2014.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Content {

    @JsonProperty("title")
    private String title;

    @JsonProperty("year")
    private String year;

    @JsonProperty("url")
    private String url;

    @JsonProperty("country")
    private String country;

    @JsonProperty("overview")
    private String overview;

    @JsonProperty("status")
    private String status;

    @JsonProperty("genres")
    private List<String> genresList;

    @JsonProperty("people")
    private People peopleList;

    @JsonProperty("air_day")
    private String airDay;

    @JsonProperty("air_time")
    private String airTime;

    @JsonProperty("imdb_id")
    private String imdbId;

    @JsonProperty("tvrage_id")
    private String tvrageId;

    @JsonProperty("top_episodes")
    private List<TopEpisodes> topEpisodesList;



    @Override
        public String toString() {
            return "Content {"
                    + "title =" + getTitle()+ " "
                    + "year =" + getYear()+ " "
                    + "url =" + getUrl()+ " "
                    + "country =" + getCountry()+ " "
                    + "overview =" + getOverview()+ " "
                    + "status =" + getStatus()+ " "
                    + "genres =" + getGenresList()+ " "
                    + "people =" + getPeopleList()+ " "
                    + "air_day =" + getAirDay()+ " "
                    + "air_time =" + getAirTime()+ " "
                    + "imdb_id =" + getImdbId()+ " "
                    + "tvrage_id =" + getTvrageId()+ " "
                    + "top_episodes =" + getTopEpisodesList()+ " "
                    + '\''
                    + '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getGenresList() {
        return genresList;
    }

    public void setGenresList(List<String> genresList) {
        this.genresList = genresList;
    }


    public String getAirDay() {
        return airDay;
    }

    public void setAirDay(String airDay) {
        this.airDay = airDay;
    }

    public String getAirTime() {
        return airTime;
    }

    public void setAirTime(String airTime) {
        this.airTime = airTime;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTvrageId() {
        return tvrageId;
    }

    public void setTvrageId(String tvrageId) {
        this.tvrageId = tvrageId;
    }

    public List<TopEpisodes> getTopEpisodesList() {
        return topEpisodesList;
    }

    public void setTopEpisodesList(List<TopEpisodes> topEpisodesList) {
        this.topEpisodesList = topEpisodesList;
    }

    public People getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(People peopleList) {
        this.peopleList = peopleList;
    }
}
