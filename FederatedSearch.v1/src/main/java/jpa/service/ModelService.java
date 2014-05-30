package jpa.service;


import jpa.AbsoluteModel;

import java.util.List;

/**
 * Created by rpal on 5/28/2014.
 */
public interface ModelService {

    public AbsoluteModel find(int id);

    public void save(AbsoluteModel toBeSaved);

   public List<AbsoluteModel> findMovie(String movieName);

    public void remove(AbsoluteModel toBeRemoved);
}
