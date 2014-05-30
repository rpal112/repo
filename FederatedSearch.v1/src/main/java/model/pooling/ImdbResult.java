package model.pooling;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by rpal on 5/27/2014.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImdbResult {

    private List<Imdb> content;
    private String imdbMovieList;

    public List<Imdb> getContent() {
        return content;
    }

    public void setContent(List<Imdb> content) {
        this.content = content;
    }

    public ImdbResult(List<Imdb> content) {
        this.content = content;
    }

    public String getImdbMovieList() {
        return imdbMovieList;
    }

    public void setImdbMovieList(String imdbMovieList) {
        this.imdbMovieList = imdbMovieList;
    }

    @Override
    public String toString() {
        return "ImdbResult{" +
                "content=" + content +
                '}';
    }
}
