/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  4
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.four;

import java.util.Scanner;

/**
 *  This program checks to see if  a password meets the following criteria:
 *      a): is at least 7 characters
 *      b) includes at least 1 lower-case letter, abc
 *      c) includes at least 1 upper-case letter, ABC
 *      d) has at least 1 numerical digit, i.e 1,2,3,5,7 etc
 *      e) has at least 1 char that is neither a letter nor digit, !@#$%^&*()
 */
public class PasswordTest {

    // Main method
    public static void main(String[] args) {
        // Constants
        String another = "y";
        final int MIN_LENGTH = 7;

        // Instantiate scanner object for user inputs
        Scanner s = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // sentinel value to terminate while loop y/n
            // Criteria to meet
            boolean isLongEnough = false, hasLower = false, hasUpper = false,
                    hasDigit = false, hasSpecialChar = false;

            // Prompt user to enter a password to test
            System.out.print("Please enter a password to test: ");
            String password = s.nextLine();
            System.out.println("Entered Password: " + password);

            int passLength = password.length();
            // Check min length condition, else carry on
            if (passLength > MIN_LENGTH) {
                isLongEnough = true;
                // Logic to loop over each char of string input
                for (int pos = 0; pos < passLength; pos++) {
                    if (hasLower && hasUpper && hasDigit && hasSpecialChar) {
                        // early break if we meet all criteria
                        break;
                    }
                    char currChar = password.charAt(pos);
                    if (Character.isLowerCase(currChar)){
                        // met lowercase criteria
                        hasLower = true;
                    } else if (Character.isUpperCase(currChar)) {
                        // met uppercase criteria
                        hasUpper = true;
                    } else if (Character.isDigit(currChar)) {
                        // met digit criteria
                        hasDigit = true;
                    } else if (!Character.isLetterOrDigit(currChar)) {
                        // met special char criteria
                        hasSpecialChar = true;
                    }
                }
            }

            // Check to see if we met all criteria
            if (isLongEnough && hasLower && hasUpper && hasDigit && hasSpecialChar) {
                // met all criteria
                System.out.println("Verdict:\t\t  Valid Password");
            } else {
                // did not meet criteria
                System.out.println("Verdict:\t\t  Invalid Password" );
            }

            System.out.println();
            System.out.print ("Test another password? (y/n)? ");
            another = s.nextLine();
        }
    }
}
