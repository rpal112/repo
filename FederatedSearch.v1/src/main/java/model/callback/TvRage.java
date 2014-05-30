package model.callback;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by rpal on 5/26/2014.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TvRage {

    @JsonProperty("airtime")
    private String airtime;

    @JsonProperty("showid")
    private String showId;

    @JsonProperty("status")
    private String status;

    @JsonProperty("runtime")
    private String runtime;

    @JsonProperty("airday")
    private String airDay;

    @JsonProperty("origin_country")
    private String originCountry;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("startdate")
    private String startDate;

    @JsonProperty("seasons")
    private String seasons;

    @JsonProperty("showname")
    private String showName;

    @JsonProperty("classification")
    private String classification;

    @JsonProperty("started")
    private String started;

    @JsonProperty("showlink")
    private String showLink;

    @JsonProperty("akas")
    private Akas akas;

    @JsonProperty("network")
    private Network network;

    public String getAirtime() {
        return airtime;
    }

    public void setAirtime(String airtime) {
        this.airtime = airtime;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getAirDay() {
        return airDay;
    }

    public void setAirDay(String airDay) {
        this.airDay = airDay;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    public String getShowLink() {
        return showLink;
    }

    public void setShowLink(String showLink) {
        this.showLink = showLink;
    }

    public Akas getAkas() {
        return akas;
    }

    public void setAkas(Akas akas) {
        this.akas = akas;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "TvRage{" +
                "airtime='" + airtime + '\'' +
                ", showId='" + showId + '\'' +
                ", status='" + status + '\'' +
                ", runtime='" + runtime + '\'' +
                ", airDay='" + airDay + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", timezone='" + timezone + '\'' +
                ", startDate='" + startDate + '\'' +
                ", seasons='" + seasons + '\'' +
                ", showName='" + showName + '\'' +
                ", classification='" + classification + '\'' +
                ", started='" + started + '\'' +
                ", showLink='" + showLink + '\'' +
                ", akas=" + akas +
                ", network=" + network +
                '}';
    }
}