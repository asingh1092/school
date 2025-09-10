/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  6
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.six;

/**
 * This class creates a function called findIndex(...) that takes in a 1D array of integer values
 *  as a param, and it returns the index of the largest value in the array. If the largest value
 *  appears more than once, return the smallest index of that value (i.e the index of first occurrence)
 *
 */
public class IndexOfLargest {

    /**
     * Function that finds the index of the largest value in the input array.
     * If the same largest value appears twice, return first index.
     *
     * @param input integer array input
     * @return index as int
     */
    public static int findIndex(int[] input) {
        int idxOfLargest = -1;
        int length = input.length;

        if (length == 0) { // edge case
            return idxOfLargest;
        }

        int largest = input[++idxOfLargest];

        // loop over input array
        for (int pos = 1; pos < length; pos++) {
            if (input[pos] >= largest) {
                // if largest but not equal, then set index and largest to appropriate values
                if (input[pos] != largest) {
                    idxOfLargest = pos;
                    largest = input[pos];
                }
            }
        }

        // return largest index
        return idxOfLargest;
    }

    // Test inputs from homework
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{15, 23, -13, 12, 11, 90, 25, -17, 90, 90}));
        System.out.println(findIndex(new int[]{5678, 123, -113, 12, 211, -500, 5678, 17, 51, 100}));
        System.out.println(findIndex(new int[]{-15, -3, -13, -62, -15, -51, -125, -117, -15, -10}));
        System.out.println(findIndex(new int[]{125, -3, -13, -62, -11, 541, -125, -117, 555, 1300}));
    }

}
