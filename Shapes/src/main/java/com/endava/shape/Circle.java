/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.endava.shape;

/**
 *
 * @author rpal
 */
public class Circle extends Shape {

    private float pi = 3.14f;
    private float r = 2f;

    

    /**
     * @return the pi
     */
    public float getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(float pi) {
        this.pi = pi;
    }

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    @Override
    float computeArea() {
        float area = pi * (r * 2);       
        return area;
    }

    @Override
    void helloWord() {
        System.out.println("Hello World from Circle !");
    }
}
