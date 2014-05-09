/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author rpal
 */
public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket client = serverSocket.accept();
            System.out.println("Clientul s-a conectat.");

            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            Scanner scanner = new Scanner(System.in);

            while(true) {

                String clientMessage = in.readLine();
                System.out.println(clientMessage);
                String msg = scanner.nextLine();
                out.println(msg);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

