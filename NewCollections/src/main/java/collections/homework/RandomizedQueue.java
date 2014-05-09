/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author rpal
 */
public class RandomizedQueue<Item> implements RandomQueueInterface<Item>, Iterable<Item> {

    private ArrayList<Item> queue;
    private Random random = new Random(100);

    public RandomizedQueue() {
        this.queue = new ArrayList<Item>();
        Collections.shuffle(queue);
        
    }

    @Override
    public Iterator<Item> iterator() {
        return this.queue.iterator();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void enqueue(Item item) {
        this.queue.add(item);
    }

    @Override
    public Item dequeue() {
        int index = random.nextInt(this.queue.size());
        Item item = this.queue.get(index);
        this.queue.remove(index);
        return item;
    }

    @Override
    public Item sample() {
        int index = random.nextInt(this.queue.size());
        Item item = this.queue.get(index);
        return item;
    }
}
