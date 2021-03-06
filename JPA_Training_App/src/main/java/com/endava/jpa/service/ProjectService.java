package com.endava.jpa.service;

import com.endava.jpa.model.Project;
import java.util.List;

public interface ProjectService {

    public Project find(int id);

    public List<Project> find(String employeeName);

    public void save(Project toBeSaved);

    public void update(Project toBeUpdated);

    public void remove(Project toBeRemoved);
}
