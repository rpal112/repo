/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpatterns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author rpal
 */
public class HashMapCryptography implements Cryptography {

    HashMap<String, Integer> alphabetMap = LetterMappingGenerator.generateAlphabetMappingHashMap();

    @Override
    public void encrypt(String plainFile, String encryptedFile) {
        Scanner input = null;
        PrintWriter output = null;

        try {
            input = new Scanner(new File(plainFile));
            output = new PrintWriter(new FileWriter(encryptedFile));

            while (input.hasNextLine()) {
                String line = input.nextLine();

                int n = line.length();

                for (int i = 0; i < n; i++) {
                    if (line.charAt(i) != ' ') {
                        output.format("%2d ", alphabetMap.get("" + line.charAt(i)));
                    }
                }
                output.println('\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            input.close();
            output.close();
        }
    }

    @Override
    public void decrypt(String encryptedFile, String decryptedFile) {
        BufferedReader input = null;
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileWriter(decryptedFile));
            input = new BufferedReader(new FileReader(encryptedFile));
            String line;
            Scanner scanner = null;
            while ((line = input.readLine()) != null) {
                scanner = new Scanner(line);
                while (scanner.hasNext()) {
                    int encryptedLetterValue = scanner.nextInt();

                    for (Entry<String, Integer> entry : alphabetMap.entrySet()) {
                        if (entry.getValue() == encryptedLetterValue) {
                            output.format("%s ", entry.getKey());
                        }
                    }
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            output.close();
        }
    }

}
