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
public class Triangle extends Shape {

    private float side1 = 5;
    private float side2 = 5;
    private float side3 = 6;

   

    @Override
    float computeArea() {
        float sp = (this.getSide1() + this.getSide2() + this.getSide3()) / 2;
        float area = (float) Math.sqrt(sp * (sp - this.getSide1()) * (sp - this.getSide2()) * (sp - this.getSide3()));
        return area;
    }

    /**
     * @return the side1
     */
    public float getSide1() {
        return side1;
    }

    /**
     * @param side1 the side1 to set
     */
    public void setSide1(float side1) {
        this.side1 = side1;
    }

    /**
     * @return the side2
     */
    public float getSide2() {
        return side2;
    }

    /**
     * @param side2 the side2 to set
     */
    public void setSide2(float side2) {
        this.side2 = side2;
    }

    /**
     * @return the side3
     */
    public float getSide3() {
        return side3;
    }

    /**
     * @param side3 the side3 to set
     */
    public void setSide3(float side3) {
        this.side3 = side3;
    }

    @Override
    void helloWord() {
        System.out.println("Hello World from Triangle !");
    }
}
