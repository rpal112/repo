/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.EmpPrjDao;
import com.endava.jpa.model.EmpPrj;
import com.endava.jpa.model.Employee;
import com.endava.jpa.model.Project;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author radu
 */
@Repository
public class EmpPrjDaoImpl implements EmpPrjDao {

    @PersistenceContext
    private EntityManager entityManager;
   

    public void addEmployee(Employee empToAdd, Project prjToAdd) {
        EmpPrj empPrj = new EmpPrj();
        empPrj.setEmployee(empToAdd);
        empPrj.setProject(prjToAdd);
        entityManager.persist(empPrj);
    }


    public EmpPrj find(int idPrj , int idEmp) {
       Query query = entityManager.createNamedQuery("EmpPrj.getById");
            query.setParameter("idPrj", idPrj);
            query.setParameter("idEmp", idEmp);
            return (EmpPrj) query.getSingleResult();
    }

    public void removeEmployee(EmpPrj empPrj) {
       entityManager.remove(empPrj);
    }

    public EmpPrj empPrjUpdate(EmpPrj empPrjToBeUpdated) {
       return entityManager.merge(empPrjToBeUpdated);
    }

    


}
