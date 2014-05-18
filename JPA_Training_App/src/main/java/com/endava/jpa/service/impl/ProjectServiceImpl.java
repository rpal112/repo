package com.endava.jpa.service.impl;

import com.endava.jpa.dao.ProjectDao;
import com.endava.jpa.model.Project;
import com.endava.jpa.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ProjectServiceImpl implements ProjectService {
    
    @Autowired
    private ProjectDao projectDao;
    
    @Override
    public Project find(int id) {
        return projectDao.find(id);
    }
    
    @Override
    public List<Project> find(String employeeName) {
        return projectDao.find(employeeName);
    }
    
    @Override
    @Transactional
    public void save(Project toBeSaved) {
        projectDao.save(toBeSaved);
    }
    
    @Override
    @Transactional
    public void update(Project toBeUpdated) {
        projectDao.update(toBeUpdated);
    }
    
    @Override
    @Transactional
    public void remove(Project toBeRemoved) {
        projectDao.remove(toBeRemoved);
    }
}
