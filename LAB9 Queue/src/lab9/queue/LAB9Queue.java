/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#09
 */
package lab9.queue;

import java.util.Scanner;

public class LAB9Queue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int value;

        QueueLL myQueue = new QueueLL();

        do {

            showMenu();
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print(">    What value do you want to enqueue: ");
                value = input.nextInt();

                myQueue.enqueue(value);
                System.out.println(">    " + value + " was successfully enqueued into the queue.");
                System.out.println();
            } // DEQUEUE node from queue
            else if (choice == 2) {

                if (myQueue.isEmpty()) {
                    System.out.println(">    Error: cannot perform dequeue (queue is empty).");
                } else {
                    Node temp = myQueue.dequeue();
                    System.out.println(">    " + temp.getData() + " has been dequeued from the queue.");
                }
                System.out.println();
            } // PEEK (look at) the 1st value of the queue...but do not actually dequeue
            else if (choice == 3) {
                // First, check to see if queue is empty.
                // IF it is, then we clearly cannot PEEK
                if (myQueue.isEmpty()) {
                    System.out.println(">    Error: cannot peek at queue (queue is empty).");
                } else {
                    System.out.println(">    " + myQueue.peek() + " is the value at the top of the queue.");
                }
                System.out.println();
            } // Search for an item in the queue
            else if (choice == 4) {
                System.out.print(">    What value do you want to search for: ");
                value = input.nextInt();
                if (myQueue.search(value)) {
                    System.out.println(">    " + value + " was found in the queue.");
                } else {
                    System.out.println(">    " + value + " was not found in the queue.");
                }
                System.out.println();
            } // Print all nodes in queue
            else if (choice == 5) {
                if (myQueue.isEmpty()) {
                    System.out.println(">    Error: cannot print nodes (the queue is empty)");
                    System.out.println();
                } else {
                    System.out.println(">    Printing All Nodes:");
                    System.out.print(">    ");
                    myQueue.PrintQueue();
                    System.out.println();
                    System.out.println();
                }
            } else if (choice == 6) {
                // Make 2 queues:
                QueueLL q1 = new QueueLL();
                QueueLL q2 = new QueueLL();
                // Insert 100 random integers (between 1 and 1000) into the queue
                for (int i = 1; i < 5; i++) {
                    q1.enqueue(i);

                }

                // Ask user to enter a value to delete from the queue
                System.out.print(">    Please enter an INT value to delete from the queue: ");
                int value2delete = input.nextInt();
                int key = 0;
                q1.PrintQueue();

                while (!(q1.isEmpty())) {
                    if (q1.peek() == value2delete) {

                        q1.dequeue();
                        key++;
                    }

                    q2.enqueue(q1.peek());
                    q1.dequeue();

                }
                while (!(q2.isEmpty())) {
                    q1.enqueue(q2.peek());
                    q2.dequeue();

                }
                q1.PrintQueue();

                System.out.println(">    The following value has been removed from the queeu: " + value2delete);
                System.out.println();
            } else if (choice == 7) {
                // Make 1 queue:
                QueueLL q1 = new QueueLL();
                QueueLL q2 = new QueueLL();
                QueueLL q3 = new QueueLL();
                // Insert 100 random integers (between 1 and 1000) into the queue
                for (int i = 0; i < 100; i++) {
                    q1.enqueue(1 + (int) (Math.random() * 999));
                }

                // ************************** YOUR CODE HERE **************************//
                // Write the code to solve Question 2.
                while (!(q1.isEmpty())) {

                    if (q1.peek() % 2 == 0) {
                        q2.enqueue(q1.peek());
                        q1.dequeue();
                    } else {
                        q3.enqueue(q1.peek());
                        q1.dequeue();
                    }

                }
                System.out.println("Even");
                q2.PrintQueue();
                System.out.println("Od");
                q3.PrintQueue();

                // We print the line below just to put a space on the output
                System.out.println();
            } else if (choice == 8) {
                // Make 1 queue and 1 stack:
                QueueLL q1 = new QueueLL();
                StackLL s1 = new StackLL();
                // Insert 100 random integers (between 1 and 1000) into the queue
                for (int i = 0; i < 6; i++) {
                    q1.enqueue(1 + (int) (Math.random() * 999));
                }
                System.out.println("Before");
                q1.PrintQueue();

                // ************************** YOUR CODE HERE **************************//
                // Write the code to solve Question 3.
                while (!(q1.isEmpty())) {

                    s1.push(q1.peek());
                    q1.dequeue();

                }
                while (!(s1.isEmpty())) {
                    q1.enqueue(s1.pop().getData());
                }
                System.out.println("After");
                q1.PrintQueue();

                System.out.println();
            } // Quit
            else if (choice == 9) {
                System.out.println(">    Goodbye!");
                System.out.println();
            } else {
                System.out.println(">    Wrong selection. Try again.");
                System.out.println();
            }

        } while (choice != 6);
    }

    public static void showMenu() {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|------     Queue - Linked List (Menu)    ------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   1. Enqueue an item                          |");
        System.out.println("|   2. Dequeue (and print) an item              |");
        System.out.println("|   3. Peek (look at) the 1st item in the queue |");
        System.out.println("|   4. Search for an item in the queue          |");
        System.out.println("|   5. Print all nodes in the queue             |");
        System.out.println("|   6. Delete node from queue (using 2nd queue) |");
        System.out.println("|   7. Copy Even and Odd value queues           |");
        System.out.println("|   8. Reverse all elements in a queue          |");
        System.out.println("|   9. Quit                                     |");
        System.out.println("|-----------------------------------------------|");
        System.out.println();
        System.out.print("> Please enter your choice: ");
    }
}
