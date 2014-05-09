/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.serializare;



/**
 *
 * @author rpal
 * @param <T>
 */
public class Node<T>{
    
    static int nrNode = 0 ;
    int data;
    
    Node previousNode;
    Node nextNode;
	
	Node(int data){
		
		this.data = data;
		nrNode++;
		
	}
    
}
