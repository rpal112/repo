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
interface Cryptography {

    public abstract void encrypt(String plainFile, String encryptedFile);

    public abstract void decrypt(String encryptedFile, String decryptedFile);

}
