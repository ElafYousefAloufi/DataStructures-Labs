/*
 * Name: Elaf Yousef Aloufi 
 * ID: 1911265
 * Section: BBR
 * Dr.Huda Aljaloud
 * Course name: CPCS204  
 * Lab#06
 */
package Recursion2;

import java.util.Scanner;

public class TriangleRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = input.nextInt();
        System.out.println();
        int SumBlocks = triangle(r);
        System.out.println("Total blocks in triangle of rows " + r + " are " + SumBlocks);

        System.out.print("Please enter any string: ");
        String s = input.next();
        System.out.println();
        int numA = countA(s);
        System.out.println("Number of A's in the string " + s + " is " + numA);

        System.out.print("Please enter any number: ");
        int n = input.nextInt();
        System.out.println();
        int num7 = count7(n);
        System.out.println("Number of 7's in the number " + n + " is " + num7);

        System.out.print("Please enter any string in lower case: ");
        String s2 = input.next();
        System.out.println();
        String newStr = changeXY(s2);
        System.out.println("Old string was " + s2);
        System.out.println("New string after changing x's into y's is " + newStr);
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return rows + triangle(rows - 1);
        }
    }

    public static int countA(String str) {
        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == 'A') {
            return 1 + countA(str.substring(1));
        } else {
            return countA(str.substring(1));
        }
    }

    public static int count7(int n) {
        if (n <= 0) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1));
        } else if (str.charAt(0) == 'y') {
            return "x" + changeXY(str.substring(1));
        } else {
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }
}
