/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns;

import static com.mycompany.designpatterns.CryptographyFactory.CryptographyType.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author rpal
 */
public class LetterMappingGenerator {
    
    final static int NUMBER_OF_LETTERS_IN_ALPHABET = 26;

	private static String getTheNthLetterInAlphabet(int N) {
		return ""+(char) ('A' + N);
	}

	public static ArrayList<LetterMapping> generateAlphabetMappingArrayList() {
		ArrayList<LetterMapping> alphabetMappingArrayList = new ArrayList<>();
		for(int i = 0 ; i < NUMBER_OF_LETTERS_IN_ALPHABET; i++) {
			alphabetMappingArrayList
			.add(new LetterMapping(getTheNthLetterInAlphabet(i), i+1));
		}
		return alphabetMappingArrayList;
	}

	public static HashMap<String, Integer> generateAlphabetMappingHashMap() {
		HashMap<String, Integer> alphabetMappingHashMap = new HashMap<>();
		for(int i = 0 ; i < NUMBER_OF_LETTERS_IN_ALPHABET; i++) {
			alphabetMappingHashMap.put(getTheNthLetterInAlphabet(i), i+1);
		}
		return alphabetMappingHashMap;
	}

	public static void generatePlainFile(String filePath, int letterCount, int breakAtCharacter) {
		System.out.println("Generated " + letterCount + " letters in file: " + filePath);
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Random randomnessGenerator = new Random();
		randomnessGenerator.setSeed(System.currentTimeMillis());

		for(int i = 0 ; i < letterCount ; i++) {
			if(i != 0 &&i % breakAtCharacter == 0) {
				out.println();
			}
			out.print((char)('A' + randomnessGenerator.nextInt(LetterMappingGenerator.NUMBER_OF_LETTERS_IN_ALPHABET))+" ");
		}

		out.close();
	}
}
