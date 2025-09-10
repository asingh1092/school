/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  11
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.eleven;


import java.util.Scanner;

/**
 * This class creates a method that counts the number of vowels with a given input from the user.
 *
 */
public class Vowels {


    /**
     * This method recursively counts vowels in an input String.
     *
     * @param input string of input
     * @return count in int of vowels
     */
    public int countVowels(String input) {
        // Edge case
        if (input.isEmpty()) {
            return 0;
        }

        // Check if first char is a vowel using helper; if so count is 1 else 0
        char c = Character.toLowerCase(input.charAt(0));
        int count;
        if (isVowel(c)) {
            count = 1;
        } else {
            count = 0;
        }

        // Recurse to substring and add count
        return count + countVowels(input.substring(1));
    }

    /**
     * Helper method to check if char is a vowel.
     *
     * @param c char c
     * @return boolean
     */
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    // Main method
    public static void main(String[] args) {
        // Variables
        String another = "y";
        Scanner s = new Scanner(System.in);
        Vowels v = new Vowels();

        while (another.equalsIgnoreCase("y")) {

            System.out.print("Please enter an input string to count vowels from: ");
            String input = s.nextLine();
            int count = v.countVowels(input);

            System.out.println("Entered string:\t  " + input);
            System.out.println("Number of vowels: " + count);

            System.out.println();
            System.out.print("Count vowels in another input? (y/n)?: ");
            another = s.nextLine();
        }

    }

}
