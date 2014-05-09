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
public final class CircularList<T> implements Serializable {

    private static final long serialVersionUID = -3153585385271963379L;
    Node<T> end;
    Node<T> start;

    public CircularList() {

        this.end = null;
        this.start = null;
    }

    public CircularList(CircularList<T> list) {

        for (Node<T> node = list.start; node.equals(end) == false; node = node.getNextNode()) {
            this.addNode(node.getValue());
        }
    }

    void addNode(T value) {

        if (start == null) {

            start = new Node<>(value, null);
            end = start;
        } else {

            Node<T> addNode = new Node<>(value, start);
            end.setNextNode(addNode);
            end = addNode;
        }
    }

    void deleteNode(int index) {

        if (index == 0) {
            this.end.setNextNode(this.start.getNextNode());
            this.start = this.end.getNextNode();
            return;
        }

        int count = 0;
        for (Node<T> node = this.start; node.equals(end) == false; node = node.getNextNode(), count++) {
            if (index == count + 1) {
                node.setNextNode(node.getNextNode().getNextNode());
                return;
            }
        }
    }

    @Override
    public String toString() {

        String output = "";

        for (Node<T> node = this.start; node.equals(end) == false; node = node.getNextNode()) {
            output += node.getValue() + "\n";
        }

        return output;
    }

}
