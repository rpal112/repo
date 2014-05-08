/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endava.constructori;

/**
 *
 * @author rpal
 */
public class ExtendedSimple extends Simple {
    
    /**
     * Constructor with no parameters
     */
    public ExtendedSimple(){
		super();
		System.out.println("Hello world from a 0 param contructor");
	}
	
    /**
     * Constructor with one parameter
     * @param i 
     */
    public ExtendedSimple(int i){
		super(i);
		System.out.println("Hello world from a 1 param contructor");
	}

    /**
     * Constructor with two parameters
     * @param i
     * @param j
     */
    public ExtendedSimple(int i , int j){
		super(i,j);
		System.out.println("Hello world from a 2 param contructor");
	}

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
	
		ExtendedSimple exS1 = new ExtendedSimple();
		ExtendedSimple exS2 = new ExtendedSimple(4);
		ExtendedSimple exS3 = new ExtendedSimple(3,4);

	}
    
}
