/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#09
 */
package lab9.queue;

public class StackLL {

    private Node top;

    public StackLL() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void PrintStack() {
        PrintStack(top);
    }

    private void PrintStack(Node top) {

        Node helpPtr = top;

        while (helpPtr != null) {

            System.out.print(helpPtr.getData() + ", ");

            helpPtr = helpPtr.getNext();
        }
        System.out.println();
    }

    public boolean search(int data) {
        return search(top, data);
    }

    private boolean search(Node p, int data) {

        Node helpPtr = p;
        while (helpPtr != null) {
            if (helpPtr.getData() == data) {
                return true;
            }
            helpPtr = helpPtr.getNext();
        }
        return false;
    }

    public void push(int data) {
        top = push(top, data);
    }

    private Node push(Node top, int data) {

        top = new Node(data, top);

        return top;
    }

    public Node pop() {

        Node temp = top;

        top = pop(top);

        return temp;
    }

    private Node pop(Node top) {

        top = top.getNext();

        return top;
    }

    public int peek() {

        int topValue = peek(top);

        return topValue;
    }

    private int peek(Node top) {
        return top.getData();
    }
}
