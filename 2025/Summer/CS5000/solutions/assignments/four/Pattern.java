/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  4
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.four;

/**
 *  This program prints out an explicit pattern using nested loops.
 *  1 2 3 4 5 6
 *    1 2 3 4 5
 *      1 2 3 4
 *        1 2 3
 *          1 2
 *            1
 *
 */
public class Pattern {

    // Main method
    public static void main(String[] args) {
        final int MAX_ROWS = 6;
        String space = "";
        for (int row = MAX_ROWS; row >= 0; row--) {
            System.out.print(space);
            space += "  "; // need to increase by 2 spaces for next row
            for (int num = 0; num < row; num++) {
                System.out.print(" " + (num + 1)); // add additional space between nums
            }
            System.out.println(); // new line
        }
    }

}
