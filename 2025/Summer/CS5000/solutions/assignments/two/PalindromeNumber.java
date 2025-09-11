/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  2
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.two;

import java.util.Scanner;

/**
 * This program reads a 5-digit number from the user as an int value and
 * determines whether the entered number is a palindrome or not.
 */
public class PalindromeNumber {

    // Main method
    public static void main(String[] args) {
        // Constants
        final int MIN_VALUE = 10000;
        final int MAX_VALUE = 99999;

        // Instantiate a scanner object for user input
        Scanner s = new Scanner(System.in);

        // Request user input
        System.out.print("Please enter a 5-digit integer value: ");
        int input = s.nextInt();
        System.out.println( "Input value:\t " + input);

        // Verify size of input value. Assuming positive values.
        if (input < MIN_VALUE || input > MAX_VALUE) {
            System.out.println("Judgement:\t\t Invalid input, must be 5 digits number.");
            return; // return as we're done here
        }

        // Process input's places to see if digits match
        int tenThousandsPlace = input % 10;
        input /= 10;
        int thousandsPlace = input % 10;
        input /= 10;
        int hundredsPlace = input % 10;
        input /= 10;
        int tensPlace = input % 10;
        input /= 10;
        int onesPlace = input % 10;
        input /= 10;

        // Check to see if tenthousands and ones place && thousands and tens place match up
        // Hundreds place doesn't need a check
        if (tenThousandsPlace == onesPlace && thousandsPlace == tensPlace) {
            System.out.println("Judgement:\t\t Palindrome");
        } else  {
            System.out.println("Judgement:\t\t Not Palindrome");
        }
    }
}
