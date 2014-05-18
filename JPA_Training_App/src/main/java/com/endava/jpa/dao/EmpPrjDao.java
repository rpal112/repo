/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endava.jpa.dao;

import com.endava.jpa.model.Employee;
import com.endava.jpa.model.Project;

/**
 *
 * @author radu
 */
public interface EmpPrjDao {

    public void addEmployee(Employee empToAdd, Project prjToAdd);

    public void removeEmployee(Employee empToRemove, Project prjToRemove);

}
