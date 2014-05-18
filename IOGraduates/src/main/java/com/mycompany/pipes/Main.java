/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pipes;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author rpal
 */
public class Main {

    public static void main(String[] argv) throws IOException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

        Thread producer = new Thread(new Producer(pipedOutputStream));
        Thread consumer = new Thread(new Consumer(pipedInputStream));

        producer.start();
        consumer.start();

    }

}