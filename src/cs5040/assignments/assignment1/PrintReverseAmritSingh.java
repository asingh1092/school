/*
 * Name:        Amrit Singh
 * Class:       CS 5040/W01
 * Term:        Fall 2025
 * Instructor:  Umama Tasnim
 */
package cs5040.assignments.assignment1;

import java.util.Scanner;

/**
 * This program prints a string input in reverse recursively.
 */
public class PrintReverseAmritSingh {

    /*
        Idea:
        reverse(Hello world)
        reverse(ello world) + H
        (reverse(llo world) + e) + H
        ((reverse(lo world) + l) + e) + H
        ...
        dlrow olleH
     */

    /**
     * Recursively prints out the given string str in reserve.
     *
     * @param str input string
     */
    private static void printCharsReverse(String str) {
        System.out.println("Reversed String:\t " + reverse(str));
    }

    /**
     * Helper method with recursive call
     *
     * @param str input
     * @return string
     */
    private static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    // Main method
    public static void main(String[] args) {
        String again = "y";
        Scanner s = new Scanner(System.in);

        while (again.equalsIgnoreCase("y")) {
            System.out.print("Please enter an input string to reverse: ");
            String input = s.nextLine();

            System.out.println("Entered String:\t\t " + input);
            printCharsReverse(input);

            System.out.print("Try again (y/n)?: ");
            again = s.nextLine();
        }
    }

}
