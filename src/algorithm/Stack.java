package algorithm;

import java.util.Iterator;

/**
 * @author 风雪中的白灵
 */
public class Stack<Item> implements Iterable<Item>
{
    private Node first;
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty(){return first == null;}

    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public static void main(String[] args){
        Stack<String> s = new Stack<String>();
    }
    @Override
    public Iterator<Item> iterator(){
        return null;
    }

}
