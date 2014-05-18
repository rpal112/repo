/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endava.jpa.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author rpal
 */

@Embeddable @Access(AccessType.FIELD)
public class Address {
    
     @Column
    private String street;
    
    @Column
    private String city;
    
    @Column(name = "state")
    private String countryState;
   
    @Column(name = "zip_code")
    private String zipCode;

    public Address() {
    }
    
    public Address(String street, String city, String state, String zip_code){
        this.street = street;
        this.city = city;
        this.countryState = state;
        this.zipCode = zip_code;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getCountryState() {
        return countryState;
    }

    /**
     * @param countryState the state to set
     */
    public void setCountryState(String countryState) {
        this.countryState = countryState;
    }

    /**
     * @return the zip_code
     */
    public String getZip_code() {
        return zipCode;
    }

    /**
     * @param zip_code the zip_code to set
     */
    public void setZip_code(String zip_code) {
        this.zipCode = zip_code;
    }
}
