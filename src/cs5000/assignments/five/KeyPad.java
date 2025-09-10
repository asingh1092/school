/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  5
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.five;

import java.util.Scanner;

/**
 * This program takes in a phone number as a string value in any format
 *  (XXX) XXX-XXXX or XXX-XXXXXX or XXX-XXX-XXXX etc
 *  and uses a method named getNumber() to convert the letters into digits
 *  2 = abc
 *  3 = def
 *  4 = ghi
 *  5 = jkl
 *  6 = mno
 *  7 = pqrs
 *  8 = tuv
 *  9 = wxyz
 *
 */
public class KeyPad {

    // Method that converts chars to nums based off of international standard letter/number mapping
    public static int getNumber(char uppercaseLetter) {
       char letterNoCase = Character.toLowerCase(uppercaseLetter);

       // conditionalize the letters for each number
       if (letterNoCase == 'a' || letterNoCase == 'b' || letterNoCase == 'c') {
           return 2;
       } else if (letterNoCase == 'd' || letterNoCase == 'e' || letterNoCase == 'f') {
           return 3;
       } else if (letterNoCase == 'g' || letterNoCase == 'h' || letterNoCase == 'i') {
           return 4;
       } else if (letterNoCase == 'j' || letterNoCase == 'k' || letterNoCase == 'l') {
           return 5;
       } else if (letterNoCase == 'm' || letterNoCase == 'n' || letterNoCase == 'o') {
           return 6;
       } else if (letterNoCase == 'p' || letterNoCase == 'q' || letterNoCase == 'r' || letterNoCase == 's') {
           return 7;
       } else if (letterNoCase == 't' || letterNoCase == 'u' || letterNoCase == 'v') {
           return 8;
       } else if (letterNoCase == 'w' || letterNoCase == 'x' || letterNoCase == 'y' || letterNoCase == 'z') {
           return 9;
       }

       // if none, print out error message and return -1;
       System.out.println("Error! Unknown letter!: " + letterNoCase);
       return -1;
    }
    // Main method
    public static void main(String[] args) {
        String another = "y";

        // Instantiate scanner object for user inputs
        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // sentinel value to terminate while loop y/n

            // Prompt for user input
            System.out.print("Enter a phone number: ");
            String phoneNumber = s.nextLine();
            System.out.println("You entered:\t " + phoneNumber);

            // Loop over phone number to convert letters to nums
            String ret = "";
            for (int pos = 0; pos < phoneNumber.length(); pos++) {
                char currChar = phoneNumber.charAt(pos);
                // ignore nums and special chars
                int num;
                if (Character.isLetter(currChar)) {
                    num = getNumber(currChar);
                    assert num != -1; // let program fail if -1
                    ret += num;
                } else {
                    // add nums and special chars to ret(urn) string
                    ret += currChar;
                }
            }

            // Output phone number
            System.out.println("Phone number:\t " + ret);

            System.out.println();
            System.out.print ("Convert another phone number (y/n)? ");
            another = s.nextLine();
        }
    }
}
