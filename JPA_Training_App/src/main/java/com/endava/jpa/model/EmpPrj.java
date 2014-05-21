/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endava.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author radu
 */
@Entity
@Table(name = "emp_prj")
@NamedQueries({
    @NamedQuery(name = "EmpPrj.getById", query = "SELECT e FROM EmpPrj e WHERE e.employee.id = :empId and e.project.id = :prjId"),
    @NamedQuery(name = "EmpPrj.getEmpNameByPrjName", query = "SELECT e.employee FROM EmpPrj e WHERE e.project.name = :prjName")
})
public class EmpPrj {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "empId", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "prjId", referencedColumnName = "id")
    private Project project;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmpPrj{"
                + "id=" + id
                + ", employee ='" + employee + '\''
                + ", project ='" + project + '\''
                + '}';
    }

}
