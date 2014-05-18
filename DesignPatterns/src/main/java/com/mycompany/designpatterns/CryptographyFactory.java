/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpatterns;

/**
 *
 * @author rpal
 */
public class CryptographyFactory {

    private static CryptographyFactory INSTANCE = null;

    private CryptographyFactory() {
    }

    public static CryptographyFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CryptographyFactory();
        }
        return INSTANCE;
    }

    public enum CryptographyType {

        ArrayList, HashMap
    }

    public Cryptography createCryptography(CryptographyType cryptographyType)
            throws IllegalArgumentException {
        {
            switch (cryptographyType) {
                case ArrayList: {
                    return new ArrayCryptography();
                }
                case HashMap: {
                    return new HashMapCryptography();
                }

            }
            throw new IllegalArgumentException();
        }
    }
    
}