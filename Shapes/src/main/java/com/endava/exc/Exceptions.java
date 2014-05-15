/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endava.exc;

/**
 *
 * @author rpal
 */
public class Exceptions {
    
    /**
     *
     * @param args
     */
    public static void main (String[] args){
        method1();
        method2();
    

    }
        static int method1() {
        try {
            return 2;
        } finally {
            System.out.println("Executing finally block in method1()");
        }
    }

    static void method2() {
        try {
            throw new RuntimeException("Unchecked error");
        } finally {
            System.out.println("Executing finally block in method2()");
        }

    
    }
    
    
}