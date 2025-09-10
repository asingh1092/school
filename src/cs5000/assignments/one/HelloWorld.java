/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  1
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.one;

import java.util.Scanner;

// This is a program that prints out an input from the user
public class HelloWorld {

    // Program main method
    public static void main(String[] args) {

        // Instantiate Scanner object for input
        Scanner s = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Please enter your name: ");

        // Read user input
        String name = s.nextLine();

        // Print out your message
        System.out.println("Hello " + name + "!");
    }
}