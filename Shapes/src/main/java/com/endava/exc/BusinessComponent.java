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
public class BusinessComponent {

    private PersistenceComponent persistenceComponent;

    /**
     *
     * @param persistenceComponent
     */
    public void setPersistenceComponent(PersistenceComponent persistenceComponent) {
        this.persistenceComponent = persistenceComponent;
    }

    /**
     *
     * @param o
     * @throws BusinessException
     */
    public void doWork(Object o) throws BusinessException {
        try {
            persistenceComponent.persist(o);
        } catch (PersistenceException ex) {
            throw new BusinessException(ex);
        }
    }

}
