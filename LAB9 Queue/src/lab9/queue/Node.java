/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#09
 */
package lab9.queue;

public class Node {

    private int data;
    private Node next;

    // CONSTRUCTORS
    public Node() {
        data = 0;
        next = null;
    }

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // ACCESSORS
    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    // MUTATORS
    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
