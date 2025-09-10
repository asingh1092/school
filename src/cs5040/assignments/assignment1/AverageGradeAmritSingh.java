/*
 * Name:        Amrit Singh
 * Class:       CS 5040/W01
 * Term:        Fall 2025
 * Instructor:  Umama Tasnim
 */
package cs5040.assignments.assignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program recursively calculates the average of inputted grades.
 */
public class AverageGradeAmritSingh {

    /*
        Idea:
        [50 75 80 80 40 35 85] = (50 + 75 + 80 + 80 + 40 + 35 + 85) / 7
        [50 75 80 80 40 35] = (50 + 75 + 80 + 80 + 40 + 35 + 85) / 6 +

        Sum all values then divide by total number of items
     */

    /**
     * Recursively compute the average of the inputted integer array
     *
     * @param input integer array of inputs
     * @return double average
     */
    private static double computeAverage(int[] input) {
        int size = input.length;
        if (size == 0) {
            return 0.0;
        } else {
            return sum(input, size) / size;
        }
    }

    /**
     *  Helper method that sums all ints in input.
     *
     * @param input input array
     * @param size size of array left
     * @return double
     */
    private static double sum(int[] input, int size) {
        if (size == 0) {
            return 0;
        } else if (size == 1) {
            return input[0];
        } else {
            return input[size - 1] + sum(input, size - 1);
        }
    }

    // Main method
    public static void main(String[] args) {
        String again = "y";
        Scanner s = new Scanner(System.in);

        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter class size as an integer value: ");
            int size = s.nextInt();
            int[] grades = new int[size];

            System.out.print("Enter grades for each student in the class (not to exceed size) as integers from 0 - 100: ");
            int pos = 0;
            while (pos != size) {
                grades[pos] = s.nextInt();
                pos++;
            }

            // Clear line
            s.nextLine();

            System.out.println("Class size:\t\t " + size);
            System.out.print("Entered Grades:\t ");
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println();
            System.out.println("Class average:\t " + String.format("%.2f", computeAverage(grades)));

            System.out.print("Try again (y/n)?: ");
            again = s.nextLine();
        }

    }

}
