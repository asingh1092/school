/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  12
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.twelve;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class determines and handles illegal array index value. This program defines
 * an integer array of size 10 elements, populates the array with random integer numbers
 * between 0 and 100, then asks the user to enter a valid index value between 0 and 9
 * and then it prints out the number stored in that location in the array.
 */
public class OutOfBoundException {

    // Main method
    public static void main(String[] args) {
        // Variables
        String another = "y";
        Scanner s = new Scanner(System.in);
        final int MAX_NUMBER = 10;

        while (another.equalsIgnoreCase("y")) {
            // Variables
            boolean isValid = false;
            int index = -1;
            int[] values = new int[MAX_NUMBER];

            // Generate values
            for (int pos = 0; pos < values.length; pos++) {
                values[pos] = (int) (Math.random() * 100);
            }

            // Get user input
            System.out.print("Enter valid index between 0 and 9: ");
            while (!isValid) {
                try {
                    // validate
                    index = s.nextInt();
                    if (index <  0 || index > 9) {
                        throw new IndexOutOfBoundsException();
                    }
                    isValid = true;
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect input, re-enter a valid index: ");
                } catch (IndexOutOfBoundsException e) {
                    System.out.print("Index out of bound, re-enter a valid index: ");
                } finally {
                    // Clear line
                    s.nextLine();
                }

            }

            // Output
            System.out.print("The element at index " +  index + " is " + values[index]);

            System.out.println();
            System.out.print("Would you like to run the program again (y/n)? ");
            another = s.nextLine();
        }

    }
}
