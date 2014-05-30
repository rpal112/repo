package com.springapp.mvc;


import jpa.service.MainService;
import jpa.AbsoluteModel;
import model.pooling.Imdb;
import model.pooling.ImdbResult;
import model.sync.SyncResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rpal on 5/23/2014.
 */
public class Main {

    public static SyncResult syncResult;
    public static Imdb imdb;
    public static ImdbResult imdbResult;
    public static AbsoluteModel absoluteModel = new AbsoluteModel();

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml");

        MainService mainService = (MainService) context.getBean("mainService");


//        SyncRestClient syncRestClient = new SyncRestClient();
//        syncRestClient.run();
//
//
//        PoolingRestClient poolingRestClient = new PoolingRestClient();
//        poolingRestClient.run();
//
//
//        CallbackRestClient callbackRestClient = new CallbackRestClient();
//        callbackRestClient.run();
//
//        System.out.println(imdbResult.getContent());

       // mainService.saveMovie();

       // mainService = new MainService();

       // mainService.findMovie();

       // mainService.findMovie();
      //  mainService.findMovieByTitle();
//        Query query = new Query();
//        query.setValue("stargate");
        //mainService.submitQuery(query);
        //mainService.checkList();




    }
}
