/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endava.jpa.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rpal
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int id;

    @Column
    private String name;

    @Column
    private Long salary;

    @Column
    private int dept_id;

    @Column
    private Timestamp birthday;

    @Embedded
    private Address address;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public Long getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    /**
     * @return the dept_id
     */
    public int getDept_id() {
        return dept_id;
    }

    /**
     * @param dept_id the dept_id to set
     */
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    /**
     * @return the birthday
     */
    public Timestamp getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

}
