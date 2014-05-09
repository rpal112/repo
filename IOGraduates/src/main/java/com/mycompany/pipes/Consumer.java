/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pipes;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 *
 * @author rpal
 */
public class Consumer implements Runnable {

    private PipedInputStream pipedInputStream;

    public Consumer(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int v = pipedInputStream.read();
                System.out.println("C:" + v + " ");
                Thread.sleep(1000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
