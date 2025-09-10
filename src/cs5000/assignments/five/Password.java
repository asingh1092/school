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
 * This program implements a method to check passwords (checkPassword) such that
 *  a) is a min 9 chars in length
 *  b) contains only letters and digits (aka no special chars)
 *  c) must include at least 3 digits
 *  d) must include at least 3 lowercase letters
 *  e) must include at least 3 upper-case letters
 */
public class Password {

    static final int MIN_LENGTH = 9;
    static final int MIN_NUM_DIGITS = 3;
    static final int MIN_NUM_LOWERCASE = 3;
    static final int MIN_NUM_UPPERCASE = 3;

    // Method to check all criteria
    public static boolean checkPassword(String password) {
        return isLongEnough(password) && hasOnlyLettersAndDigits(password)
                && hasMinDigits(password) && hasMinLowercase(password)
                && hasMinUppercase(password);
    }

    // Method to check if password is long enough
    public static boolean isLongEnough(String password) {
        return password.length() >= MIN_LENGTH;
    }

    // Method to see if password has special characters
    public static boolean hasOnlyLettersAndDigits(String password) {
        for (int pos = 0; pos < password.length(); pos++) {
            if (!Character.isLetterOrDigit(password.charAt(pos))) {
                // has special char
                return false;
            }
        }
        return true;
    }

    // Method to check number of digits
    public static boolean hasMinDigits(String password) {
        int num = 0;
        for (int pos = 0; pos < password.length(); pos++) {
            if (Character.isDigit(password.charAt(pos))) {
                num++;

                // check if we hit threshold
                if (num == MIN_NUM_DIGITS) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check number of lowercase letters
    public static boolean hasMinLowercase(String password) {
        int num = 0;
        for (int pos = 0; pos < password.length(); pos++) {
            if (Character.isLowerCase(password.charAt(pos))) {
                num++;

                // check if we hit threshold
                if (num == MIN_NUM_LOWERCASE) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check number of uppercase letters
    public static boolean hasMinUppercase(String password) {
        int num = 0;
        for (int pos = 0; pos < password.length(); pos++) {
            if (Character.isUpperCase(password.charAt(pos))) {
                num++;

                // check if we hit threshold
                if (num == MIN_NUM_UPPERCASE) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        String another = "y";

        // Instantiate scanner object for user inputs
        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // sentinel value to terminate while loop y/n

            // Prompt for user input
            System.out.print("Enter a password: ");
            String password = s.next();
            System.out.println("Entered password: " + password);
            if (checkPassword(password)) {
                System.out.println("Judgement:\t\t  Valid Password");
            } else {
                System.out.println("Judgement:\t\t  Invalid Password");
            }

            System.out.println();
            System.out.print ("Test another password (y/n)? ");
            another = s.next();
        }
    }
}
