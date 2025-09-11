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
 *  This class determines the average of four integer grades between 0 and 100.
 */
public class MismatchException {

    // Main method
    public static void main(String[] args) {
        // Variables
        String another = "y";
        Scanner s = new Scanner(System.in);
        final int MAX_NUMBER = 4;

        while (another.equalsIgnoreCase("y")) {
            // Variables
            int pos = 0;
            int[] values = new int[MAX_NUMBER];

            // Get user input
            System.out.print("Enter four grades between 0 and 100 (any extra will be ignored): ");
            while (pos < MAX_NUMBER) {
                try {
                    int value = s.nextInt();
                    if (value >= 0 && value <= 100) {
                        values[pos++] = value;
                    } else {
                        throw new InputMismatchException();
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Incorrect input, re-enter valid grades: ");
                    s.nextLine();
                    pos = 0;
                }
            }

            // Clear next line
            s.nextLine();

            // Output
            int total = 0;
            System.out.print("Entered grades are:\t ");
            for (int i = 0; i < values.length; i++) {
                if (i == values.length - 1) {
                    System.out.print(values[i]);
                } else {
                    System.out.print(values[i] + ", ");
                }
                total += values[i];
            }
            double average = (double) total / MAX_NUMBER;
            System.out.println("\nStudent Average: \t " + String.format("%.2f", average));


            System.out.println();
            System.out.print("Would you like to run the program again (y/n)? ");
            another = s.nextLine();
        }

    }
}
