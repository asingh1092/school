/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  9
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.nine;

import java.util.Scanner;

/**
 *  This class is used to test the HotelRating class
 */
public class TestHotelRating {

    // Main method
    public static void main(String[] args) {
        // Variables
        Scanner s = new Scanner(System.in);
        String another = "y";

        while (another.equalsIgnoreCase("y")) {
            int hotels = 0;
            int years = 0;

            // create HotelRatings object
            System.out.print("Please enter number of hotels to generate ratings for (integer value): ");
            hotels = s.nextInt();
            System.out.print("Please enter the number of years to generate ratings for (integer value): ");
            years = s.nextInt();

            HotelRating hotelRating = new HotelRating(hotels, years);

            // Five star indices
            System.out.print("Five stars hotels indices:\t\t\t\t ");
            int[] fiveStars = hotelRating.fiveStarsHotels();
            for (int index : fiveStars) {
                if (index == fiveStars.length - 1) {
                    System.out.print(index);
                } else {
                    System.out.print(index + ", ");
                }
            }

            // Average hotel ratings
            hotelRating.averageRatings();

            // Four or more star hotel indices
            hotelRating.fourOrMoreStars();

            // Any five stars?
            System.out.println("\nAny five stars hotel?\t\t\t\t\t " + hotelRating.anyFiveStars());

            // Best hotel index
            System.out.println("Best hotel index:\t\t\t\t\t\t " + hotelRating.bestHotel());

            // Worst hotel index
            System.out.println("Worst hotel index:\t\t\t\t\t\t " + hotelRating.worstHotel());

            // Print out chart
            hotelRating.printChart();

            // Clear leftover newline
            s.nextLine();

            System.out.println();
            System.out.print("Enter another round of values (y/n)? ");
            another = s.nextLine();
        }
    }

}
