/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endava.jpa.service;

import com.endava.jpa.model.EmpPrj;
import com.endava.jpa.model.Employee;
import com.endava.jpa.model.Project;
import java.util.List;

/**
 *
 * @author radu
 */
public interface EmpPrjService {

    public void addEmployee(Employee empToAdd , Project prjToAdd);

    public void removeEmployee(EmpPrj empPrj);
    
    public EmpPrj empPrjUpdate(EmpPrj empPrj);
    
    public EmpPrj find(int empId , int idPrj);
    

}
