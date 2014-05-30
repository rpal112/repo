package jpa.service;

import jpa.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rpal on 5/30/2014.
 */
public class CleanDataBase {

    @Autowired
    private MovieDao movieDao;

    public void removeAll(){

    }


}
