/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads;

import java.util.ArrayList;

/**
 *
 * @author rpal
 */
public class List implements Runnable{

    public static int i;

   // public static void main(String[] args) {
        //        ArrayList<Integer> loopList = new ArrayList<>();
        //        for (int i = 1; i < 50; i++) {
        //            loopList.add(i);
        //        }
        //        for (Integer list : loopList) {
        //            System.out.print(" " + list);
        //        }

    public static void main(String[] args) {
        int max = 100;

       
        ArrayList<Integer> list = new ArrayList<>();

        
        for (int n = 1; n < max; n++) {
            boolean prime = true;
            

            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    prime = false;
                    break; 
                }
            }
            if (prime && n != 1) {
                list.add(n);
            }
        }
        for (int i : list) {
            System.out.println(i + " ");
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

