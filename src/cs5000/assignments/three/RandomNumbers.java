/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  3
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.three;

/**
 * This program makes use of the Math.random() function to output random values between
 * certain ranges.
 */
public class RandomNumbers {

    // Main Method
    public static void main(String[] args) {
        // Part A: Generate random integer between 20 and 80 (inclusive).
        int value = (int) (Math.random() * 61) + 20; //add to get pos range [0, 60] + 20 = [20,80]
        System.out.println("A random integer between 20 and 80 (inclusive):\t\t\t " + value);

        // Part B: Generate random integer between -20 and 20 (inclusive).
        value = (int) (Math.random() * 41) - 20; // subtract here to get neg range [0, 40] - 20 = [-20,20]
        System.out.println("A random integer between -20 and 20 (inclusive):\t\t " + value);

        // Part C: Generate random integer between -50 and -20 (inclusive).
        value = (int) (Math.random() * 31) - 50; // same here; [0, 30] - 50 = [-50,-20]
        System.out.println("A random integer between -50 and -20 (inclusive):\t\t " + value);

        // Part D: Generate random float between 0.0 and 21.9999 (inclusive).
        float fValue =(float) (Math.random() * 21.9999); // [0.0, 1.0] * 21.9999 = [0.0, 21.999]
        System.out.println("A random integer between 0.0 and 21.9999 (inclusive):\t " + fValue);
    }
}
