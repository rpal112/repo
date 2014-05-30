package jpa.service;

import com.springapp.mvc.HelloController;
import com.springapp.mvc.TvRageController;
import jpa.AbsoluteModel;
import model.pooling.Imdb;
import model.sync.Content;
import model.sync.TrackTv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restClients.CallbackRestClient;
import restClients.PoolingRestClient;
import restClients.SyncRestClient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rpal on 5/28/2014.
 */
@Service
public class MainService {

    public static Imdb imdb = new Imdb();
    public static TrackTv trackTv = new TrackTv();
    public static PoolingRestClient poolingRestClient = new PoolingRestClient();
    public static SyncRestClient syncRestClient = new SyncRestClient();
    public static TvRageController tvRageController = new TvRageController();
    public static CallbackRestClient callbackRestClient = new CallbackRestClient();
    public AbsoluteModel absoluteModel = new AbsoluteModel();


    @Autowired
    private ModelService modelService;
    @Autowired
    private HelloController helloController;

    public void save(AbsoluteModel absoluteModel) {
        modelService.save(absoluteModel);
    }

    public List<AbsoluteModel> findMovieByTitle(String query) {
        List<AbsoluteModel> absolutModelList = modelService.findMovie(query);
        for (AbsoluteModel absolutModel : absolutModelList) {
           // System.out.println(absolutModelList.size() + "size");
           // System.out.println(absolutModelList + " list");

        }
      return absolutModelList;
    }

    public void delete(AbsoluteModel absoluteModel){
        modelService.remove(absoluteModel);
    }


    public void objCreate(Content content, Imdb imdb, AbsoluteModel absoluteModel) {
        absoluteModel.setTitle(imdb.getTitle());
        absoluteModel.setPoster(imdb.getPoster());
        absoluteModel.setActors(imdb.getActors());
        absoluteModel.setAwards(imdb.getAwards());
        absoluteModel.setDirector(imdb.getDirector());
        absoluteModel.setWriter(imdb.getWriter());
        absoluteModel.setYear(content.getYear());
        absoluteModel.setCountry(imdb.getCountry());
        absoluteModel.setGenre(imdb.getGenre());
        absoluteModel.setImdbId(content.getImdbId());
        absoluteModel.setTvrageId(content.getTvrageId());
        absoluteModel.setImdbRating(imdb.getImdbRating());
        absoluteModel.setImdbVotes(imdb.getImdbVotes());
        absoluteModel.setReleased(imdb.getReleased());
        absoluteModel.setPlot(imdb.getPlot());
        absoluteModel.setRated(imdb.getRated());


    }

    public List<AbsoluteModel> merge(List<Content> contents, List<Imdb> imdbs) {
        Iterator<Content> contentIterator = contents.iterator();
        Iterator<Imdb> imdbIterator = imdbs.iterator();
        List<AbsoluteModel> absoluteModels = new ArrayList<AbsoluteModel>();
        Imdb imdb1;
        Content content;

        while (contentIterator.hasNext()) {
            content = contentIterator.next();
            while (imdbIterator.hasNext()) {
                imdb1 = imdbIterator.next();
                if (imdb1.getImdbID().equals(content.getImdbId())) {
                    AbsoluteModel absoluteModel1 = new AbsoluteModel();
                    objCreate(content, imdb1, absoluteModel1);
                    absoluteModels.add(absoluteModel1);
                }
            }
            imdbIterator = imdbs.iterator();
        }
        return absoluteModels;
    }



}








