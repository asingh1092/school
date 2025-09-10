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

/**
 *  This program takes at most 10 inputs from the user as an array, and passes that array
 *  into a method named Count(..) to determine, and print out the occurrence of each value in the array
 *  and print out the result as shown.
 *
 *  Sentential value is 0, invalid inputs should be ignored/rejected. Only postive integers from 1 - 100 are allowed.
 *
 */
public class CountOccurrences {

    // Method to count occurrences of integers in an array
    public static void count(int[] input){
        int[] freq = new int[100]; // here 0th position is 1, 99 is 100

        // increment the number of times we see the number in the array in freq array
        for (int n : input) {
            if (n != 0) { // account for arrays less than size 10 (i.e they can be empty/0)
                freq[n - 1]++;
            }
        }

        for (int n : input) {
            if (n != 0) { // account for arrays less than size 10 (i.e they can be empty/0)
                int value = freq[n - 1]; // get value from freq map
                // make sure value at freq is greater than 0
                if (value > 0) {
                    String time = value == 1 ? " time" : " times";
                    // print out statement
                    System.out.println(n + " occurred\t" + value + time);
                    freq[n - 1] = 0;
                }
            }
        }
    }

    // Instantiate main method
    public static void main(String[] args) {
        String another = "y";
        int MAX_ITEMS  = 10;
        int NUM_TO_TERMINATE = 0;

        // Instantiate array that can hold up to 10 values
        int[] values = new int[10];

        // Instantiate scanner object for user inputs
        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // sentinel value to terminate while loop y/n

            // Prompt user for input
            System.out.print("Enter up to 10 integers between 1 and 100 (0 to stop): ");
            int next = s.nextInt();

            int numOfItems = 0;
            int pos = 0;

            while (next != NUM_TO_TERMINATE) {

                // Only take positive numbers from 1 to 100
                if (next > 0 && next <= 100) {

                    // Make sure we're not over max size of array
                    numOfItems++;
                    if (numOfItems <= MAX_ITEMS) {
                        values[pos] = next;
                        pos++;
                    }
                }
                next = s.nextInt();
            }

            // Run the count method to see occurrences
            count(values);

            System.out.println();
            System.out.print ("Test another set of positive integers (y/n)? ");
            another = s.next();
        }
    }
}
