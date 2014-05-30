package jpa.dao;


import jpa.AbsoluteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rpal on 5/26/2014.
 */
@Repository
public interface MovieDao  {

   public AbsoluteModel find(int id);

   public void save(AbsoluteModel toBeSaved);

    public List<AbsoluteModel> find(String movieName);

    public void remove(AbsoluteModel toBeRemoved);


}
