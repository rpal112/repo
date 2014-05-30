package com.springapp.mvc;

import java.util.concurrent.Callable;

/**
 * Created by rpal on 5/29/2014.
 */
public class Query implements Callable<Query>{

    private String value = "stargate" ;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Query{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public Query call() throws Exception {
        return this;
    }


}
