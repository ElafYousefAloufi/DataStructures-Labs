/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#02 
 */
package searchproject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Random;

public class Lab2 {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
         System.out.println("How many elements of the array? ");
        int num = input1.nextInt();
        int[] array = new int[num];
        init(array);
        int choice, key, foundIndex;
        long startTime, stopTime, totalTime;

        do {
            choice = PrintMenu(input1);
           
            init(array);
            if (choice == 1) {
                System.out.print("Please enter the value you want to search for: ");
                key = input1.nextInt();
                startTime = System.nanoTime();
                foundIndex = linearSearch(array, key);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                if (foundIndex != -1) {
                    System.out.println("The entered value \"" + key + "\" is found in index number >> " + foundIndex);
                    System.out.println("Time taken in searching >> " + totalTime + " nanoSec <<");
                } else {
                    System.out.println("The entered value \"" + key + "\" is not found");
                    System.out.println("Time taken in searching >> " + totalTime + " nanoSec <<");
                }
            } else if (choice == 2) {
                System.out.print("Enter the value you want to search for: ");
                key = input1.nextInt();
                startTime = System.nanoTime();
                foundIndex = binarySearch(array, key);
                stopTime = System.nanoTime();
                totalTime = stopTime - startTime;
                if (foundIndex != -1) {
                    System.out.println("The entered value \"" + key + "\" is found in index number >> " + foundIndex);
                    System.out.println("Time taken in searching >> " + totalTime + " nanoSec <<");
                } else {
                    System.out.println("The entered value \"" + key + "\" is not found");
                    System.out.println("Time taken in searching >> " + totalTime + " nanoSec <<");
                }
            } else if (choice == 3) {
                System.out.println();
                System.out.println(" > Exiting...");
                System.out.println(" > Goodbye");

                break;
            }
            System.out.println();
        } while (true);
    }

    public static int PrintMenu(Scanner input1) {
        System.out.print("****************************************************************\n"
                + "************************* Search Menu **************************\n"
                + "****************************************************************\n"
                + "1. Linear Search                                               |\n"
                + "2. Binary Search                                               |\n"
                + "3. Quit                                                        |\n"
                + "---------------------------------------------------------------\n\n"
                + ">Enter your selection:");
        int choice = input1.nextInt();

        return choice;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] array, int key) {
        int low = 0, high = array.length - 1, mid = (low + high) / 2;
        while (low <= high) {
            if (key < array[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
            } else if (key > array[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else if (key == array[mid]) {
                return mid;
            }
        }
        return -1;
    }

    public static void init(int[] array) {
        Random randNum = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(10000000);
        }

        Arrays.sort(array);

    }
}
