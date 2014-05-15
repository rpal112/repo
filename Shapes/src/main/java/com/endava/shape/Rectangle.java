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
public class Rectangle extends Shape {

    private float lenght = 7;
    private float width = 4;

    @Override
    float computeArea() {
        float area = getLenght() * getWidth();
        return area;
    }

    /**
     * @return the lenght
     */
    public float getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    void helloWord() {
        System.out.println("Hello World from Rectangle !");
    }

}
