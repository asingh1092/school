/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  4
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.four;

import java.util.Scanner;

/**
 * This program prompts user to enter positive integer values using a sentinel while loop.
 * Program accepts integer inputs until user enters the value -1.
 */
public class InputSum {

    // Main method
    public static void main(String[] args) {
        String another = "y";

        // Instantiate scanner object for user inputs
        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // sentinel value to terminate while loop y/n

            // Get input from user; quit internal loop by entering -1
            System.out.print("Enter positive integers (-1 to quit): ");
            int total = 0;
            int value = s.nextInt();
            String enteredNums = "";

            while (value != -1) {
                // Check if positive integer
                if (value > 0) {
                    // if positive, add to total and list
                    enteredNums = enteredNums + value + ", ";
                    total += value;
                }
                value = s.nextInt();
            }

            // Remove last comma and space if length is > 0 (for Fifth test)
            if (enteredNums.length() > 0) {
                enteredNums = enteredNums.substring(0, enteredNums.length() - 2);
            }

            // Print string of positive nums and sum
            System.out.println("Entered numbers: " + enteredNums);
            System.out.println("The Sum:\t\t " + total);

            System.out.println();
            System.out.print ("Test another set of positive integers (y/n)? ");
            another = s.next();
        }
    }
}
