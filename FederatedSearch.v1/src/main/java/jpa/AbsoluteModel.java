package jpa;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * Created by rpal on 5/26/2014.
 */
@Entity
@Table(name = "moviereq")
@NamedQueries({
        @NamedQuery(name = "getMovieByTitle" , query = "select a from AbsoluteModel a where a.title like :title"),
        @NamedQuery(name = "deleteMovieByTimestamp" , query =  "select a from AbsoluteModel  a where a.timestamp = :timestamp")
})

public class AbsoluteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    private String year;

    private String rated;

    private String released;

    private String country;

    private String genre;

    private String director;

    private String writer;

    private String actors;

    private String awards;

    private String imdbId;

    private String imdbRating;

    private String imdbVotes;

    private String tvrageId;

    private String poster;

    private String plot;


    private Timestamp timestamp;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getTvrageId() {
        return tvrageId;
    }

    public void setTvrageId(String tvrageId) {
        this.tvrageId = tvrageId;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "AbsoluteModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", released='" + released + '\'' +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actors='" + actors + '\'' +
                ", awards='" + awards + '\'' +
                ", imdbId='" + imdbId + '\'' +
                ", imdbRating='" + imdbRating + '\'' +
                ", imdbVotes='" + imdbVotes + '\'' +
                ", tvrageId='" + tvrageId + '\'' +
                ", poster='" + poster + '\'' +
                ", plot='" + plot + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
