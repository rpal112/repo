/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endava.exc;

/**
 *
 * @author rpal
 */
public class PersistenceComponent {
    void persist(Object arg) throws PersistenceException {
        throw new PersistenceException("Cannot persist object " + arg.toString());
    }

   

    
}
