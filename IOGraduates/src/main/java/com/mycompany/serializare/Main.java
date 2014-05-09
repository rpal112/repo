/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.serializare;

import java.io.Serializable;

/**
 *
 * @author rpal
 */
public class Main implements Serializable{
    
     public static void main(String[] args) {

        CircularList list = new CircularList();

        list.addNodes(1);
        list.addNodes(2);
        list.addNodes(3);
        list.addNodes(4);
        list.addNodes(5);
        list.addNodes(6);

        list.print();
        System.out.println();
        

        System.out.println();
        System.out.println("The number of DNodes in the Linked List is " + Node.nrNode);

    }
    
}
