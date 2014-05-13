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

    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<>();
        long startHash = System.currentTimeMillis();
        mapLetter(hMap);
        long endHash = System.currentTimeMillis();
        
        System.out.println("Time spend in ms: " + (endHash - startHash));
        
        System.out.println("");
        
        List<LetterMapping> listLetter = new ArrayList<>();
        long startArray = System.currentTimeMillis();
        letterMapingToArray(listLetter);
        long endArray = System.currentTimeMillis();
        
        System.out.println("Time spend in ms: " + (endArray - startArray));

    }
}
