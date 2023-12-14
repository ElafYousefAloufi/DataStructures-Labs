/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#09
 */
package lab9.queue;

public class QueueLL {

    private Node front;
    private Node back;

    // CONSTRUCTOR
    public QueueLL() {
        front = null;
        back = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void PrintQueue() {
        PrintQueue(front);
    }

    private void PrintQueue(Node front) {

        Node helpPtr = front;

        while (helpPtr != null) {

            System.out.print(helpPtr.getData() + ", ");

            helpPtr = helpPtr.getNext();
        }
        System.out.println();
    }

    public boolean search(int data) {
        return search(front, data);
    }

    private boolean search(Node p, int data) {

        Node helpPtr = p;
        while (helpPtr != null) {
            if (helpPtr.getData() == data) {
                return true;
            }
            helpPtr = helpPtr.getNext(); // step one node over		
        }
        return false;
    }

    public void enqueue(int data) {
        if (isEmpty()) {
            front = back = enqueue(front, back, data);
        } else {
            back = enqueue(front, back, data);
        }

    }

    private Node enqueue(Node front, Node back, int data) {
        // Make a new QueueNode with "data" as the data value
        Node temp = new Node(data);

        if (isEmpty()) {
            return temp;
        } else {
            back.setNext(temp);
            back = back.getNext();
            return back;
        }
    }

    public Node dequeue() {
        Node temp = front;
        front = dequeue(front);
        if (front == null) {
            back = null;
        }
        return temp;
    }

    private Node dequeue(Node front) {
        front = front.getNext();
        return front;
    }

    public int peek() {
        // Invoke the peek method with front as a parameter
        int frontValue = peek(front);

        // return topValue
        return frontValue;
    }

    private int peek(Node front) {

        return front.getData();
    }
}
