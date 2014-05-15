/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.httpapp;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 *
 * @author rpal
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Info {

    private String title;
    private String description;
    private String termsOfServiceUrl;
    private String contact;
    private String license;
    private String licenseUrl;

    @Override
    public String toString() {

        return this.title + " - " + this.description + " - " + this.termsOfServiceUrl + " - "
                + this.contact + " - " + this.license + " - " + this.licenseUrl;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }
}
