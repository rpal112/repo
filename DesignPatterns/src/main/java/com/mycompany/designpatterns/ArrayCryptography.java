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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rpal
 */
public class ArrayCryptography implements Cryptography {

    private ArrayList<LetterMapping> alphabetMap = LetterMappingGenerator.generateAlphabetMappingArrayList();

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
                        for (int j = 0; j < LetterMappingGenerator.NUMBER_OF_LETTERS_IN_ALPHABET; j++) {
                            if (alphabetMap.get(j).getLetter().equals("" + line.charAt(i))) {
                                output.format("%2d ", alphabetMap.get(j).getNumber());
                                break;
                            }
                        }
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
                    int encyptedLetterValue = scanner.nextInt();
                    output.format("%s ", alphabetMap.get(encyptedLetterValue - 1).getLetter());
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(ArrayCryptography.class.getName()).log(Level.SEVERE, null, ex);
            }
            output.close();
        }
    }

}
