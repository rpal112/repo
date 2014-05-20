package com.endava.jpa.service.impl;

import com.endava.jpa.dao.EmployeeDao;
import com.endava.jpa.model.Employee;
import com.endava.jpa.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee find(int id) {
        return employeeDao.find(id);
    }

    @Override
    public List<Employee> find(String employeeName) {
        return employeeDao.find(employeeName);
    }

    @Override
    @Transactional
    public void save(Employee toBeSaved) {
        employeeDao.save(toBeSaved);
    }

    @Override
    @Transactional
    public void update(Employee toBeUpdated) {
        employeeDao.update(toBeUpdated);
    }

    @Override
    @Transactional
    public void remove(Employee toBeRemoved) {
        employeeDao.remove(toBeRemoved);
    }

    public List<Employee> findByCityAndByDepartment(String city, int id) {
        return employeeDao.findByCityAndByDepartment(city, id);
    }

    public List<Employee> findEmployeeByProjectName(String projectName) {
        return employeeDao.findEmployeeByProjectName(projectName);
    }
}
