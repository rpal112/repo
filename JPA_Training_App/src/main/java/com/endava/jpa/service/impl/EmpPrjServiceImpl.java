/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endava.jpa.service.impl;

import com.endava.jpa.dao.EmpPrjDao;
import com.endava.jpa.model.Employee;
import com.endava.jpa.model.Project;
import com.endava.jpa.service.EmpPrjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author radu
 */
@Service
@Transactional(readOnly = true)
public class EmpPrjServiceImpl implements EmpPrjService{

    @Autowired
    private EmpPrjDao empPrjDao;
    
    @Override
    @Transactional
    public void addEmployee(Employee empToAdd, Project prjToAdd) {
       empPrjDao.addEmployee(empToAdd, prjToAdd);
    }

    public void removeEmployee(Employee empToRemove, Project prjToRemove) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
