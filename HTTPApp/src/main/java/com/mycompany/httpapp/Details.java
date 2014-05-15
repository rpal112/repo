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
public class Details {

    private String apiVersion;
    private String swaggerVersion;
    private Info info;

    @Override
    public String toString() {

        return this.apiVersion + " - " + this.swaggerVersion + " - " + this.info;

    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getSwaggerVersion() {
        return swaggerVersion;
    }

    public void setSwaggerVersion(String swaggerVersion) {
        this.swaggerVersion = swaggerVersion;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}