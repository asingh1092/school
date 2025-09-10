/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  6
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.six;

import java.util.Scanner;

import static cs5000.assignments.six.IndexOfLargest.findIndex;

/**
 *  This class holds a main method that asks a user to input 10 integers into an array, calls findIndex(..)
 *  of class IndexOfLargest o determine and display the index of the first largest value in the array.
 * 
 */
public class TestIndexOfLargest {

    // Main method of applications
    public static void main(String[] args) {
        String another = "y";
        int MAX_ITEMS  = 10;

        // Instantiate array that can hold up to 10 values
        int[] values = new int[10];

        // Instantiate scanner object for user inputs
        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // sentinel value to terminate while loop y/n

            // Prompt user for input
            System.out.print("Enter up to 10 integers to find the index of largest first occurrence: ");

            int numOfItems = 0;
            int pos = 0;

            while (numOfItems < MAX_ITEMS) {
                // Make sure we're not over max size of array
                numOfItems++;
                values[pos] = s.nextInt();
                pos++;
            }

            // Run the count method to see occurrences
            int index = findIndex(values);

            // Output
            String output = "";
            for (int n : values) {
                output = output + n + " ";
            }

            System.out.println("You entered these values:\t " + output);
            System.out.println("Index of largest value:\t\t " + index);

            System.out.println();
            System.out.print ("Test another set of 10 integers (y/n)? ");
            another = s.next();
        }

    }
}
