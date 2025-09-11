/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  3
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.three;

import java.util.Scanner;

/**
 * This program will read two strings from user input, manipulates the strings using
 * the String class, and prints out the outcomes.
 */
public class StringMethods {

    // Main method
    public static void main(String[] args) {

        // Instantiate scanner object for input:
        Scanner s = new Scanner(System.in);

        // Part A: Get user input for 2 strings
        System.out.print("Please input string_1 and press enter: ");
        String string_1 = s.nextLine();
        System.out.print("Please input string_2 and press enter: ");
        String string_2 = s.nextLine();

        // Part B: Get lengths of strings
        System.out.printf("Length of String 1:\t %s\n", string_1.length() + " characters");
        System.out.printf("Length of String 1:\t %s\n", string_2.length() + " characters");

        // Part C: Concatenate strings (using concat instead of +)
        System.out.printf("Concatenation:\t\t %s\n", string_1.concat(" ".concat(string_2)));

        // Part D: Check equality of strings (do not ignore case)
        System.out.printf("Equal Strings?:\t\t %s\n", string_1.equals(string_2) ? "Equal" : "Not Equal");

        // Part E: Upper case String 1
        System.out.printf("Uppercase String 1:\t %s\n", string_1.toUpperCase());
        // Part F: Lower case String 2
        System.out.printf("Lowercase String 2:\t %s\n", string_2.toLowerCase());

        // Part G: Get a valid substring (any indices) from string 1 assuming that string_1's length is larger than 1
        System.out.printf("Valid Substring:\t %s\n", string_1.substring(0, string_1.length() - 1));
    }
}
