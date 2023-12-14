/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#05
 */
package Recursion;

import java.util.Scanner;

public class SumNums {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter second number: ");
        int num2 = input.nextInt();
        System.out.println("");

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("The sum of integers from " + num1 + " to " + num2 + " is: " + SumNumbers(num1, num2));
    }

    public static int SumNumbers(int a, int b) {

        if (a == b) {
            return a;
        } else {
            return b + SumNumbers(a, b - 1);
        }

    }

    public static int SumEven(int a) {
        if (a <= 0) {
            return 0;
        }
        return a + SumEven(a - 2);
    }

    public static int SubNumbers(int a) {

        if (a != 1) {
            return SubNumbers(a - 1) - a;
        } else {
            return a;
        }
    }

    public static void ArrayRevRec(int[] a, int i, int j) {
        if (j == i) {

        } else {

            int tempHigh = a[j];
            a[j] = a[i];
            a[i] = tempHigh;

            ArrayRevRec(a, i + 1, j - 1);
        }

    }

    public static void RevIntRec(int a) {

        if (a <= 0) {

        } else {
            System.out.print(a % 10);
            RevIntRec(a / 10);
        }

    }
}
