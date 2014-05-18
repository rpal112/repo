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
public class ShapeTest {

    private static float computeShapeArea(Shape s) {
        return s.computeArea();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();

        for (Shape s : shapes) {
            s.helloWord();
            if (s instanceof Circle) {
                System.out.println("The area of the circle is: " + computeShapeArea(s));
            }
            else if (s instanceof Triangle) {
                System.out.println("The area of the triangle is: " + computeShapeArea(s));
            }
            else {
                System.out.println("The area of the rectangle is: " + computeShapeArea(s));
            }
        }
    }

}
