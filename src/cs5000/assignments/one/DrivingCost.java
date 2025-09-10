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

/* This program inputs the distance, fuel efficiency, price per gallon as doubles and
   outputs the trip cost in dollars.
 */
public class DrivingCost {

    // Main method
    public static void main(String[] args) {

        // Instantiate a Scanner object for input
        Scanner s = new Scanner(System.in);

        // Get input for distance from user
        System.out.print("Please enter the distance (miles) driven: ");
        double distance = s.nextDouble();

        // Get input for miles per gallon from user
        System.out.print("Please enter your vehicle's fuel efficiency (mpg): ");
        double mpg = s.nextDouble();

        // Get input for price per gallon from user
        System.out.print("Please enter the price per gallon of gas ingested (dollars): ");
        double pricePerGallon = s.nextDouble();

        // Compute the trip cost (in dollars)
        double cost = distance / mpg * pricePerGallon;

        // Display output with respected inputs;
        System.out.println("The distance (miles):\t\t " + distance);
        System.out.println("Fuel efficiency (mpg):\t\t " + mpg);
        System.out.println("Price per gallon (dollars):\t $" + pricePerGallon);
        System.out.println("The trip cost (dollars):\t $" + cost);
    }
}
