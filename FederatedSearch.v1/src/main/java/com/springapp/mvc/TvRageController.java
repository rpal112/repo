package com.springapp.mvc;

import model.callback.TvRage;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rpal on 5/26/2014.
 */

@Controller
@RequestMapping("/tvrage/callback")
public class TvRageController {

    private List<TvRage> content;

    public List<TvRage> getContent() {
        return content;
    }

    public void setContent(List<TvRage> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TvRageController{" +
                "content=" + content +
                '}';
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String getAnswer(@RequestBody String answer, ModelMap modelMap) throws IOException {
       // System.out.println(answer);

        ObjectMapper mapper = new ObjectMapper();
        TvRage tvRage = mapper.readValue(answer, TvRage.class);
        setContent(Arrays.asList(tvRage));

        return "redirect:/";


    }





}
