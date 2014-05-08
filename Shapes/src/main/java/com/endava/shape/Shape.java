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
public abstract class Shape {
    
    Shape(){
        System.out.println("Hello World!");
    }
    
     abstract float computeArea();

    abstract void helloWord();
}
