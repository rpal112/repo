package jpa.dao;


import jpa.AbsoluteModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
* Created by rpal on 5/29/2014.
*/
@Repository
@Transactional(readOnly = false)
public class MovieDaoImpl implements MovieDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public AbsoluteModel find(int id) {
        return entityManager.find(AbsoluteModel.class , id);
    }

    @Override
    @Transactional
    public void save(AbsoluteModel toBeSaved) {
        entityManager.persist(toBeSaved);


    }

    @Transactional
    public void removeByTimestamp(AbsoluteModel absoluteModel){
        Query query = entityManager.createNamedQuery("deleteMovieByTimestamp");
        query.setParameter("timestamp", absoluteModel);

    }

    @Override

    public List<AbsoluteModel> find(String title) {
       // System.out.println("movie found: " + title);
        Query query = entityManager.createNamedQuery("getMovieByTitle");
        query.setParameter("title","%"+title+"%");
        return query.getResultList();


    }

    @Override
    public void remove(AbsoluteModel toBeRemoved) {

        entityManager.remove(entityManager.contains(toBeRemoved) ? toBeRemoved : entityManager.merge(toBeRemoved));
    }
}
