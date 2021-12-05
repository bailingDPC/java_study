package algorithm;

import java.util.Iterator;

/**
 * @author 风雪中的白灵
 */
public class Queue<Item> implements Iterable<Item>
{
    private Node first;
    private Node last;
    private int n;
    private class Node {
        Item item;
        Node next;
    }

    private boolean isEmpty(){
        return first == null;
    }

    private int size(){
        return n;
    }

    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
        n++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        n--;
        return item;
    }
    @Override
    public Iterator<Item> iterator(){
        return null;
    }
}
