/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author rpal
 */
public class Main {

    public static void letterMapingToArray(List<LetterMapping> letterMapingArray) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            letterMapingArray.add(new LetterMapping("" + letter, letter - 'A'));
            System.out.println("Array letter: " + letter + " nr: " + (letter - 'A'));
        }
    }

    public static void mapLetter(HashMap<String, Integer> letterMapingHash) {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            letterMapingHash.put("" + letter, letter - 'A');
            System.out.println("HashMap letter: " + letter + " nr: " + (letter - 'A'));
        }
    }

    public static void main( String[] args ) throws IllegalArgumentException
	{
		/*generate plain text file - 800000 letter - 80 per line*/
		LetterMappingGenerator.generatePlainFile("plainFile.txt", 800000, 80);

		/*instantiate a singleton factory for cryptography*/
		CryptographyFactory crypthographyFactory = CryptographyFactory.getInstance();

		/*for the factory create a cryptography tool that uses ArrayList for Letter Mapping*/
		Cryptography cryptography1 = crypthographyFactory.createCryptography(CryptographyFactory.CryptographyType.ArrayList);

		/*for the factory create a cryptography tool that uses HashMap for Letter Mapping*/
		Cryptography cryptography2 = crypthographyFactory.createCryptography(CryptographyFactory.CryptographyType.HashMap);

		/*time measurement variables*/
		long t0, t1;

		/* ArrayList encryption and decryption */
		t0 = System.currentTimeMillis();
		cryptography1.encrypt("plainFile.txt", "encryptedFile1.txt");
		t1 = System.currentTimeMillis();
		System.out.println("Encryption time with ArrayList " + (t1 - t0) + "ms");

		t0 = System.currentTimeMillis();
		cryptography1.decrypt("encryptedFile1.txt", "decryptedFile1.txt");
		t1 = System.currentTimeMillis();
		System.out.println("Decryption time with ArrayList " + (t1 - t0) + "ms");

		/* HashMap encryption and decryption */
		t0 = System.currentTimeMillis();
		cryptography2.encrypt("plainFile.txt", "encryptedFile2.txt");
		t1 = System.currentTimeMillis();
		System.out.println("Encryption time with HashMap   " + (t1 - t0) + "ms");

		t0 = System.currentTimeMillis();
		cryptography2.decrypt("encryptedFile2.txt", "decryptedFile2.txt");
		t1 = System.currentTimeMillis();
		System.out.println("Decryption time with HashMap   " + (t1 - t0) + "ms");
	}
}
