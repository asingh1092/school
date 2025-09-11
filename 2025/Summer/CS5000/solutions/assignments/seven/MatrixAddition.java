/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  7
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.seven;

import java.util.Scanner;

/**
 * This program asks the user to generate two 3x3 matrices and adds them together.
 *
 */
public class MatrixAddition {

    /**
     * This function takes two matrices of equal nxn size and returns a matrix that adds
     * their respective values that are in the same space.
     *
     * @param one an nxn matrix
     * @param two an nxn matrix
     * @return added nxn matrix
     */
    public static int[][] add(int[][] one, int[][] two) {
        // Check inputs for equality
        if (one.length != two.length || one[0].length != two[0].length) {
            return new int[][]{};
        }

        // Variables
        int rows = one.length;
        int cols = one[0].length;
        int[][] ret = new int[rows][cols];

        // Add row and cols of two nxn arrays of equal size
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                ret[row][col] = one[row][col] + two[row][col];
            }
        }

        // return added matrix for further processing
        return ret;
    }

    /**
     * This method prints out a matrix to the console.
     *
     * @param name name of matrix
     * @param matrix integer array of nxn matrix
     */
    public static void printMatrix(String name, int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println();
        System.out.println("Matrix " + name + ":");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        // Variables
        String another = "y";
        int rows = 3;
        int cols = 3;
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) {

            // Get two 3x3 matrices from user input
            // Matrix 1
            System.out.print("Please enter 9 values for first 3x3 matrix, first 3 for row 1, second 3 for row 2, and third 3 for row 2: ");
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    matrixA[row][col] = s.nextInt();
                }
            }


            // Get two 3x3 matrices from user input
            // Matrix 2
            System.out.print("Please enter 9 values for second 3x3 matrix, first 3 for row 1, second 3 for row 2, and third 3 for row 2: ");
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    matrixB[row][col] = s.nextInt();
                }
            }

            // Print both matrices
            printMatrix("A", matrixA);
            printMatrix("B", matrixB);

            // Add matrices
            int[][] added = add(matrixA, matrixB);

            // Print added matrix
            printMatrix("A+B", added);

            System.out.println();
            System.out.print("Add two additional 3x3 matrices (y/n)? ");
            another = s.next();
        }
    }
}
