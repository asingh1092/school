/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  9
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.nine;

/**
 *  This class is to create the properties and behaviors of a HotelRating object
 */
public class HotelRating {

    // Only data value - rows = hotels; cols = years
    private int[][] hotelRatings;

    private HotelRating() {
        // private no arg constructor so it can't be called
    }

    public HotelRating(int numberOfHotels, int yearsOfRatings) {
        if (numberOfHotels <= 0 || yearsOfRatings <= 0) {
            System.out.println("Invalid values. Please choose at least 1 hotel and year");
        } else {
            // Generate hotel ratings
            hotelRatings = new int[numberOfHotels][yearsOfRatings];
            for (int hotelNumber = 0; hotelNumber < numberOfHotels; hotelNumber++) {
                for (int year = 0; year < yearsOfRatings; year++) {
                    // random hotel rating from 1 to 5
                    hotelRatings[hotelNumber][year] = (int) (1 + Math.random() * 5);
                }
            }
        }
    }

    // lines 39 - 45: These  are not data/props because the HW explicitly said only one data field
    private int hotels() {
        return hotelRatings.length;
    }

    private int years() {
        return hotelRatings[0].length;
    }

    /**
     * Gets average ratings per hotel
     *
     * @return double[] of average ratings per hotel
     */
    private double[] getAverageRatings() {
        // Variables
        int hotels = hotels();
        int years = years();
        double[] avgRatings = new double[hotels];

        // get average ratings per hotel
        for (int hotel = 0; hotel < hotels; hotel++) {
            int total = 0;
            for (int year = 0; year < years; year++) {
                total += hotelRatings[hotel][year];
            }
            double average = (double) total / years();
            avgRatings[hotel] = average;
        }

        return avgRatings;
    }

    /**
     * Gets an int[] of all five star rated hotels at least 1 year.
     *
     * @return int[] of indices of hotels that have been rated at least 1 5 star
     */
    public int[] fiveStarsHotels() {
        // Variables
        int count = 0;
        int[] fiveStars = new int[hotels()];
        int hotels = hotels();
        int years = years();

        // Loop over hotel ratings and see which hotel got at least a 5
        for (int hotelNumber = 0; hotelNumber < hotels; hotelNumber++) {
            for (int year = 0; year < years; year++) {
                if (hotelRatings[hotelNumber][year] == 5) {
                    fiveStars[count++] = hotelNumber;
                    break;
                }
            }
        }

        // now get rid of trailing 0's
        int[] ret = new int[count];
        int pos = 0;
        for (int hotel = 0; hotel < hotels; hotel++) {
            for (int year = 0; year < years; year++) {
                if (hotelRatings[hotel][year] == 5) {
                    ret[pos++] = hotel;
                    break;
                }
            }
        }
        return ret;
    }

    /**
     * Prints out the average ratings per hotel
     */
    public void averageRatings() {
        // Variables
        int hotels = hotels();

        // get average ratings per hotel
        System.out.println();
        System.out.println("Average Ratings are: ");
        double[] avgRatings = getAverageRatings();

        for (int hotel = 0; hotel < hotels; hotel++) {
            // print out average per hotel
            double average = avgRatings[hotel];
            System.out.printf("\t\tHotel %d:\t\t\t\t\t\t %.2f\n", hotel, average);
        }
    }

    /**
     * Prints out the indices of all hotels ith 4 or more stars.
     */
    public void fourOrMoreStars() {
        // Variables
        int hotels = hotels();
        int years = years();
        int count = 0;
        int[] fourOrOver = new int[hotels];

        // loop over ratings and print out four stars or higher
        System.out.print("Four or more stars hotels indices:\t\t ");
        for (int hotel = 0; hotel < hotels; hotel++) {
            for (int year = 0; year < years; year++) {
                int rating = hotelRatings[hotel][year];
                if (rating >= 4) {
                    fourOrOver[count++] = hotel;
                    break;
                }
            }
        }

        // get rid of trailing 0s and format correctly
        int pos = 0;
        do {
            System.out.print(fourOrOver[pos++]);
            if (pos != count) {
                System.out.print(", ");
            }
        } while (pos < count);
    }

    /**
     * Returns whether any hotel had 5 stars.
     *
     * @return boolean if any 5 stars given
     */
    public boolean anyFiveStars() {
        // Variables
        int hotels = hotels();
        int years = years();

        // loop over ratings and check if five stars
        for (int hotel = 0; hotel < hotels; hotel++) {
            for (int year = 0; year < years; year++) {
                int rating = hotelRatings[hotel][year];
                if (rating == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Get index of first best average hotel
     *
     * @return int value of hotel #
     */
    public int bestHotel() {
        // Variables
        int bestIdx = 0;
        double bestRating = 0;
        int hotel = 0;

        // Get averages
        double[] avgRatings = getAverageRatings();

        // loop to get the best hotel rating
        for (double rating : avgRatings) {
            if (rating > bestRating) {
                bestIdx = hotel;
                bestRating = rating;
            }
            hotel++;
        }
        return bestIdx;
    }

    /**
     * Get index of first worst average hotel
     *
     * @return int value of hotel #
     */
    public int worstHotel() {
        // Variables
        int worstIdx = 0;
        double worstRating = 5;
        int hotel = 0;

        // Get averages
        double[] avgRatings = getAverageRatings();

        // loop to get the worst hotel rating
        for (double rating : avgRatings) {
            if (rating < worstRating) {
                worstIdx = hotel;
                worstRating = rating;
            }
            hotel++;
        }
        return worstIdx;
    }

    /**
     *  Prints out the hotel ratings chart based off of this:
     * Ratings chart:
     *                  Year1  Year2  Year3 Year4
     * -------------------------------------------------------------------------------------------------
     *          Hotel 0: **    ***    ***** ***
     *          Hotel 1: ***   ***    **    **
     *          Hotel 2: ***** ****   ****  *****
     *
     */
    public void printChart() {
        // Variables
        int hotels = hotels();
        int years = years();

        // Print out chart
        System.out.println("\nRatings Chart:");
        System.out.println();

        // Years
        System.out.print("\t\t\t");
        for (int year = 0; year < years; year++) {
            System.out.printf("%-7s", "Year" + (year + 1));
        }
        // Hyphens
        System.out.println("\n" + "-".repeat(9*years));

        // hotels and ratings *****
        for (int hotel = 0; hotel < hotels; hotel++) {
            System.out.printf("Hotel %d:\t", hotel);
            for (int year = 0; year < years; year++) {
                System.out.printf("%-7s", "*".repeat(hotelRatings[hotel][year]));
            }
            System.out.println();
        }
    }

    // Local Test method
    public static void main(String[] args) {
        HotelRating hotelRating = new HotelRating(3, 4);
        hotelRating.fiveStarsHotels();
        hotelRating.averageRatings();
        hotelRating.fourOrMoreStars();
        hotelRating.anyFiveStars();
        System.out.println(hotelRating.bestHotel());
        System.out.println(hotelRating.worstHotel());
        hotelRating.printChart();
    }
}