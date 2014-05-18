package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.ProjectDao;
import com.endava.jpa.model.Project;
import java.util.List;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class ProjectDaoImpl implements ProjectDao {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public Project find(int id) {
        return entityManager.find(Project.class, id);
    }
    
    public List<Project> find(String projectName) {
        Query query = entityManager.createNamedQuery("Project.getByName");
        query.setParameter("name", projectName);
        return query.getResultList();
    }
    
    public void save(Project toBeSaved) {
        entityManager.persist(toBeSaved);
    }
    
    public void update(Project toBeUpdated) {
        entityManager.merge(toBeUpdated);
    }
    
    public void remove(Project toBeRemoved) {
        entityManager.remove(toBeRemoved);
    }
}
