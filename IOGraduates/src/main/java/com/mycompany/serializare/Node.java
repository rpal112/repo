/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serializare;

import java.io.Serializable;

/**
 *
 * @author rpal
 * @param <T>
 */
class Node<T> implements Serializable {

    private static final long serialVersionUID = -3825931614408133369L;
    private T value;
    private Node<T> next;

    Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    void setValue(T newValue) {
        this.value = newValue;
    }

    T getValue() {
        return this.value;
    }

    void setNextNode(Node<T> newNextNode) {
        this.next = newNextNode;
    }

    Node<T> getNextNode() {
        return this.next;
    }
}
