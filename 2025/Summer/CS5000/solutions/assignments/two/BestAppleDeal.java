/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  2
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.two;

import java.util.Scanner;

/**
 * This program takes two boxes, a small and large box of apples and determines
 * which is the better deal. If both are the same, output both.
 */
public class BestAppleDeal {

    // Main method
    public static void main(String[] args) {

        // Instantiate a scanner object for user input.
        Scanner s = new Scanner(System.in);

        // Request user input
        System.out.print("Please enter small box weight (in Pounds): ");
        int sBoxWeight = s.nextInt();
        System.out.print("Please enter small box price (in Dollars): ");
        int sBoxPrice = s.nextInt();
        System.out.print("Please enter large box weight (in Pounds): ");
        int lBoxWeight = s.nextInt();
        System.out.print("Please enter large box price (in Dollars): ");
        int lBoxPrice = s.nextInt();

        // Print out user input
        System.out.println("Small box weight:\t " + sBoxWeight + " Pounds");
        System.out.println("Small box price:\t " + sBoxPrice + " Dollars");
        System.out.println("Large box weight:\t " + lBoxWeight + " Pounds");
        System.out.println("Large box price:\t " + lBoxPrice + " Dollars");

        // Compute price / box
        double sPricePerLbs = (double) sBoxPrice / sBoxWeight;
        double lPricePerLbs = (double) lBoxPrice / lBoxWeight;

        // Logical statements for judgement
        if (sPricePerLbs == lPricePerLbs) {
            // Same deal
            System.out.println("Judgement:\t\t\t Both boxes are of the same value.");
        } else if (sPricePerLbs > lPricePerLbs) {
            // large is better deal
            System.out.println("Judgement:\t\t\t The large box is a better deal.");
        } else {
            // small is better deal
            System.out.println("Judgement:\t\t\t The smaller box is a better deal.");
        }
    }

}
