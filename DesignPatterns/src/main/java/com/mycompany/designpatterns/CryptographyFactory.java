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

    private static CryptographyFactory INSTACNCE = null;
    
    enum CryptographyType{
        ArrayList , HashMap
    }
    
    public Cryptography createCryptography(CryptographyType cryptographyType) {
       switch(cryptographyType){
           case ArrayList:
               return new ArrayCryptography();
           case HashMap:
               return new HashMapCryptography();
               
           
    }
       throw Exception;
    }

    private CryptographyFactory() throws Exception {
        throw new Exception("Accessed private");
    }

    public static CryptographyFactory create() throws Exception {
        if (INSTACNCE == null) {
            INSTACNCE = new CryptographyFactory();
        }
        return INSTACNCE;
    }

}
