/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  11
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.eleven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class counts the average grades recursively depending on user input.
 */
public class CountAverageGrades {

    /**
     * Recursively find average of a list of grades
     *
     * @param grades list of grades
     * @param sum sum so far
     * @param index index position of list
     * @return average of type double
     */
    private double findAverage(List<Integer> grades, double sum, int index) {
        // Edge case
        if (grades.isEmpty()) return 0;

        // Base case
        if (index == grades.size()) {
            return sum / grades.size();
        }

        return findAverage(grades,  sum + grades.get(index), index + 1);
    }

    // Main method
    public static void main(String[] args) {
        // Variables
        String another = "y";
        Scanner s = new Scanner(System.in);
        CountAverageGrades countAverageGrades = new CountAverageGrades();

        while (another.equalsIgnoreCase("y")) {

            // Ask user to input class size
            System.out.print("Enter class size (positive integer value): ");
            int size = s.nextInt();

            // Instantiate list
            List<Integer> grades = new ArrayList<>(size);

            // Ask user to enter grades
            System.out.print("Enter grades for each student (positive integer values). " +
                    "Number of grades larger than the size of the class will be ignored: ");
            while (grades.size() != size) {
                int value = s.nextInt();

                // Check if positive integer
                if (value >= 0) {
                    grades.add(value);
                } else {
                    System.out.println("Please only enter positive integer values. " +
                            "Remaining values to fill in: " + (size - grades.size()));
                }
            }

            // Clear extra new line
            s.nextLine();

            // Find average
            double average = countAverageGrades.findAverage(grades, 0, 0);

            // Print out output
            System.out.println("Class size:\t\t " + size);
            System.out.print("Entered grades:\t ");
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println("\nClass average:\t " + String.format("%.2f", average));

            System.out.println();
            System.out.print("Enter another series of grades (y/n)?: ");
            another = s.nextLine();
        }
    }
}
