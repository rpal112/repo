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
public class ChainedExceptionsDemo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        PersistenceComponent persistenceComponent = new PersistenceComponent();
        BusinessComponent businessComponent = new BusinessComponent();
        businessComponent.setPersistenceComponent(persistenceComponent);

        
        try {
            businessComponent.doWork(new Object());
        } catch (BusinessException ex) {
            Throwable cause = ex.getCause();  //  method inherited from java.lang.Throwable

            if (cause instanceof PersistenceException) {
                PersistenceException pex = (PersistenceException) cause;
                System.out.println("PersistenceException caught: " + pex.getMessage());
            }
        }
    }

}
