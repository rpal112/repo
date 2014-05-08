/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.homework;

/**
 *
 * @author rpal
 */
public class RandomizedQeueuImpl {

    public static void main(String[] args) {

        RandomizedQueue<String> queue = new RandomizedQueue<>();
        final int MAX = 15;

        for (int i = 0; i < MAX; i++) {
            queue.enqueue("Item - " + i);
        }

        for (int i = 0; i < MAX / 2; i++) {
            queue.dequeue();
        }

        for (String item : queue) {
            System.out.println(item);
        }

    }

}
