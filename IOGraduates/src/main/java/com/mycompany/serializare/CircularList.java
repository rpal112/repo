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
public class CircularList{

    static Node root;
    static Node temp;
    static Node current;

    public void addNodes(int data) {

        Node dNode = new Node(data);

        if (root == null) {

            root = dNode;
            root.previousNode = null;
            root.nextNode = null;

        } else {

            current = root;

            while (current.nextNode != null) {

                current = current.nextNode;

            }

            current.nextNode = dNode;
            dNode.previousNode = current;
            dNode.nextNode = null;

        }

    }

    public void insertNode(int data, int after) {

        Node dNode = new Node(data);

        int ithNode = 1;

        current = root;

        while (ithNode != after) {

            current.nextNode = root;

            ithNode++;

        }

        temp = current.nextNode;

        current.nextNode = dNode;
        dNode.nextNode = temp;
        temp.previousNode = dNode;
        dNode.previousNode = current;

    }

    public void deleteNode(int nodeNumber) {

        int ithNode = 1;

        current = root;

        if (nodeNumber == 1) {

            root = current.nextNode;
            current.nextNode = null;
            current.previousNode = null;

        } else {

            while (ithNode != nodeNumber) {

                current = current.nextNode;

                ithNode++;

            }

            if (current.nextNode == null) {

                current.previousNode.nextNode = null;
                current.previousNode = null;

            } else {

                current.previousNode.nextNode = current.nextNode;
                current.nextNode.previousNode = current.previousNode;

            }

        }

    }
    
    public void print() {

        current = root;
        boolean arrow = true;

        do {

            System.out.print((arrow) ? "|" + current.data + "|" : " --> " + "|" + current.data + "|");

            arrow = false;

            current = current.nextNode;

        } while (current != null);

    }

    

}
