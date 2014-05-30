package jpa;

import jpa.dao.MovieDao;
import jpa.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rpal on 5/28/2014.
 */
@Service
@Transactional(readOnly = true)
public class ServImpl implements ModelService {


    @Autowired
    private MovieDao movieDao;


    @Override
    public AbsoluteModel find(int id) {
        return movieDao.find(id);
    }

    @Override
    public void save(AbsoluteModel toBeSaved) {
            movieDao.save(toBeSaved);
    }


    @Override
    public List<AbsoluteModel> findMovie(String movieName) {
            return movieDao.find(movieName);
    }

    @Override
    public void remove(AbsoluteModel toBeRemoved) {
        movieDao.remove(toBeRemoved);
    }


}
