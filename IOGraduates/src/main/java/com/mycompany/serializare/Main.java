/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serializare;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author rpal
 */
public class Main {

    public static final int listSize = 5;

    public static void main(String[] args) {

        CircularList<String> NSCircularList = new CircularList<>();

        for (int i = 0; i < listSize; i++) {
            NSCircularList.addNode("This is element: " + i);
        }

        // Serializare.
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("out.bin"));
            objectOutputStream.writeObject(NSCircularList);
        } catch (IOException e) {
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                }
            }
        }

        // Deserializare.
        ObjectInputStream objectInputstream = null;
        CircularList<String> SCircularList = null;

        try {
            objectInputstream = new ObjectInputStream(new FileInputStream("out.bin"));
            SCircularList = ((CircularList<String>) objectInputstream.readObject());
        } catch (IOException | ClassNotFoundException e) {
        } finally {
            if (objectInputstream != null) {
                try {
                    objectInputstream.close();
                } catch (IOException e) {
                }
            }
        }

        System.out.println("Initial list: \n" + NSCircularList);
        System.out.println("Deserialized: \n" + SCircularList);

    }

}
