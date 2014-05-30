package com.springapp.mvc;

import jpa.AbsoluteModel;
import jpa.service.MainService;
import model.pooling.Imdb;
import model.sync.TrackTv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import restClients.PoolingRestClient;
import restClients.SyncRestClient;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private MainService mainService;
    @Autowired
    private PoolingRestClient poolingRestClient;
    @Autowired
    private SyncRestClient syncRestClient;
    @Autowired
    private AbsoluteModel absoluteModel;


//    ApplicationContext context = new ClassPathXmlApplicationContext("file:C:/Users/rpal/Documents/FederatedSearch.v1/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml");
//
//    MainService mainService = (MainService) context.getBean("mainService");

    @RequestMapping(method = RequestMethod.GET)
    public String search(Locale locale, ModelMap model) {
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String searchMovie(@RequestParam String query, ModelMap modelMap) throws IOException {


//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        timestamp.setMinutes(timestamp.getMinutes() - 15);
        //System.out.println(timestamp + " : " + timestamp.getMinutes());

            Calendar calendar = Calendar.getInstance();

        List<AbsoluteModel> absoluteModelList = mainService.findMovieByTitle(query);


        if (absoluteModelList == null || absoluteModelList.isEmpty()) {

            List<Imdb> imdbList = poolingRestClient.query(query);
            TrackTv trackTv = syncRestClient.query(query);
            List<AbsoluteModel> absoluteModels = mainService.merge(trackTv.getContentEntryList(), imdbList);

            modelMap.addAttribute("noEntry", trackTv.getContentEntryList());
            modelMap.addAttribute("trackTv", trackTv);
            modelMap.addAttribute("absoluteModels", absoluteModels);
            modelMap.addAttribute("query", trackTv.getQuery());

            for (AbsoluteModel absoluteModel : absoluteModels) {
                if (absoluteModels.size() != 0) {
                    System.out.println(absoluteModel);
                    System.out.println("trying to save obj");
                    mainService.save(absoluteModel);
                    System.out.println("obj saved");


                }
//        }else{

            }
        } else {
            for (int i =0;i<absoluteModelList.size();i++){
                long diff = calendar.getTimeInMillis() - absoluteModelList.get(i).getTimestamp().getTime();
                if(diff > 900000){
                    mainService.delete(absoluteModelList.get(i));
                }
            }
            modelMap.addAttribute("absoluteModels", absoluteModelList);
        }

        //mainService.findMovieByTitle(query);
        return "hello";


//        System.out.println(query);
//        //MainService mainService = new MainService();
//        mainService.setQuery(query);
//        System.out.println("maineService query " + mainService.getQuery());
//        mainService.findMovie();
//        // mainService.submitQuery(query);
//        return "redirect:/";
    }


}