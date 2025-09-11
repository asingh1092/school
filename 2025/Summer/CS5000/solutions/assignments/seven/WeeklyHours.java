/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  7
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.seven;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This program generates random daily hours (0-10) for 3 employees over the course of a week
 * and prints out the weekly hours for each employee.
 */
public class WeeklyHours {

    /**
     * This function adds the weekly hours based off a 2D schedule integers input array
     * and prints out the schedule.
     *
     * @param schedule integer input array (2D)
     */
    public static void addHours(int[][] schedule) {
        // Variables
        int rows = schedule.length;
        int cols = schedule[0].length;
        int[] hoursPerEmployee = new int[rows];

        // Loop over 2D array and add up hours to place in hoursPerEmployee 1D array
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                hoursPerEmployee[row] += schedule[row][col];
            }
        }

        // Print out and format
        System.out.println();
        System.out.println("Employee#\tWeekly Hours");
        System.out.println("---------------------------");
        int employee = 1;
        for (int hours : hoursPerEmployee) {
            System.out.println("\t" + employee + "\t\t\t" + hours);
            employee++;
        }
    }

    // Main method
    public static void main(String[] args) {
        // variables
        String another = "y";
        int rows = 3;
        int cols = 7;
        int[][] weeklyHours = new int[rows][cols];

        // Instantiate scanner for user input
        Scanner s = new Scanner(System.in);

        // sentinel loop
        while (another.equalsIgnoreCase("y")) {


            // Randomly generate hours for 3 employees from 0 to 10 ([(int) (Math.random() * 11)] = [0, 10])
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    weeklyHours[row][col] = (int) (Math.random() * 11);
                }
            }

            // Print out schedule and format correctly
            System.out.println();
            System.out.println("\t\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun");
            int employee = 1;
            for (int[] employeeHours : weeklyHours) {
                System.out.print("Employee" + employee + "\t");
                for (int hour : employeeHours) {
                    System.out.print(" " + hour + "\t");
                }
                System.out.println();
                employee++;
            }

            // Call method to add hours and print
            addHours(weeklyHours);

            System.out.println();
            System.out.print("Generate daily hours for employees (y/n)? ");
            another = s.nextLine();
        }
    }
}
