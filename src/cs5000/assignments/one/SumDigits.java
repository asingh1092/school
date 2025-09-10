/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  1
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.one;

import java.util.Scanner;

// This is a program that sums out the digits of a (at max) 4-digit integer number; i.e from 0 to 9000.
public class SumDigits {

    // Main method
    public static void main(String[] args) {

        // Instantiate scanner object for input
        Scanner s = new Scanner(System.in);

        // Prompt user for Input
        System.out.print("Please enter an integer number between 0 and 9000: ");

        // Read user input
        int input = s.nextInt();

        // Print out user input
        System.out.println("The input number is:\t " + input);

        // Compute sum of input
        int thousandsPlace = input % 10; // Get digit from thousands place
        input /= 10; // Pop off thousands place number
        int hundredsPlace = input % 10; // Get digit from hundreds place
        input /= 10; // Pop off hundreds place number
        int tensPlace = input % 10; // Get digit from tens place
        input /= 10; // Pop off tens place number
        int onesPlace = input % 10; // Get digit from ones place

        System.out.println("The sum of digits is:\t " + (thousandsPlace + hundredsPlace + tensPlace + onesPlace));
    }
}
