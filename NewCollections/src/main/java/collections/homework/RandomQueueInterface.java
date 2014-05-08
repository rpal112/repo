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
public interface RandomQueueInterface<Item> {

    public boolean isEmpty();           

    public int size();                  

    public void enqueue(Item item);     

    public Item dequeue();           

    public Item sample();             

}
