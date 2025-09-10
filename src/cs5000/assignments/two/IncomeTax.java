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

// This program reads annual income tax from user and then
// prints out the entered income along with the tax bracket
// followed by tax amount
public class IncomeTax {

    // Main method
    public static void main(String[] args) {
        // Instantiate constants
        final int THREE_PERCENT_THRESHOLD = 30000;
        final int TEN_PERCENT_THRESHOLD = 70000;
        final int FIFTEEN_PERCENT_THRESHOLD = 150000;
        final int TWENTY_PERCENT_THRESHOLD = 300000;
        final int THIRTY_FIVE_PERCENT_THRESHOLD = 900000;

        final double THREE_PERCENT = 0.03;
        final double TEN_PERCENT = 0.1;
        final double FIFTEEN_PERCENT = 0.15;
        final double TWENTY_PERCENT = 0.2;
        final double THIRTY_FIVE_PERCENT = 0.35;
        final double FORTY_PERCENT = 0.4;

        // Instantiate scanner object for user input
        Scanner s = new Scanner(System.in);

        // Request user for input of their annual income
        System.out.print("Please enter your annual income before taxes: ");
        int income = s.nextInt();

        // Calculate taxes and tax bracket
        double taxes;
        int taxBracket = 3; // default tax bracket
        if (income <= THREE_PERCENT_THRESHOLD) {
            // taxes for income less than $30,000
            taxes = income * THREE_PERCENT;
        } else if (income <= TEN_PERCENT_THRESHOLD) {
            // taxes for income > $30,0000 but less than $70,0000
            taxBracket = 10;
            taxes = THREE_PERCENT_THRESHOLD * THREE_PERCENT +
                    (income - THREE_PERCENT_THRESHOLD) * TEN_PERCENT;
        } else if (income <= FIFTEEN_PERCENT_THRESHOLD) {
            // taxes for income > $70,0000 but less than $150,0000
            taxBracket = 15;
            taxes = THREE_PERCENT_THRESHOLD * THREE_PERCENT +
                    (TEN_PERCENT_THRESHOLD - THREE_PERCENT_THRESHOLD) * TEN_PERCENT +
                    (income - TEN_PERCENT_THRESHOLD) * FIFTEEN_PERCENT;
        } else if (income <= TWENTY_PERCENT_THRESHOLD) {
            // taxes for income > $150,0000 but less than $300,0000
            taxBracket = 20;
            taxes = THREE_PERCENT_THRESHOLD * THREE_PERCENT +
                    (TEN_PERCENT_THRESHOLD - THREE_PERCENT_THRESHOLD) * TEN_PERCENT +
                    (FIFTEEN_PERCENT_THRESHOLD - TEN_PERCENT_THRESHOLD) * FIFTEEN_PERCENT +
                    (income - FIFTEEN_PERCENT_THRESHOLD) * TWENTY_PERCENT;
        } else if (income <= THIRTY_FIVE_PERCENT_THRESHOLD) {
            // taxes for income > $300,0000 but less than $900,0000
            taxBracket = 35;
            taxes = THREE_PERCENT_THRESHOLD * THREE_PERCENT +
                    (TEN_PERCENT_THRESHOLD - THREE_PERCENT_THRESHOLD) * TEN_PERCENT +
                    (FIFTEEN_PERCENT_THRESHOLD - TEN_PERCENT_THRESHOLD) * FIFTEEN_PERCENT +
                    (TWENTY_PERCENT_THRESHOLD - FIFTEEN_PERCENT_THRESHOLD) * TWENTY_PERCENT +
                    (income - TWENTY_PERCENT_THRESHOLD) * THIRTY_FIVE_PERCENT;
        } else {
            // taxes for income is greater than $900,000
            taxBracket = 40;
            taxes = THREE_PERCENT_THRESHOLD * THREE_PERCENT +
                    (TEN_PERCENT_THRESHOLD - THREE_PERCENT_THRESHOLD) * TEN_PERCENT +
                    (FIFTEEN_PERCENT_THRESHOLD - TEN_PERCENT_THRESHOLD) * FIFTEEN_PERCENT +
                    (TWENTY_PERCENT_THRESHOLD - FIFTEEN_PERCENT_THRESHOLD) * TWENTY_PERCENT +
                    (THIRTY_FIVE_PERCENT_THRESHOLD - TWENTY_PERCENT_THRESHOLD) * THIRTY_FIVE_PERCENT +
                    (income - THIRTY_FIVE_PERCENT_THRESHOLD) * FORTY_PERCENT;
        }

        // Cast as integer
        int taxesAsInt = (int) taxes;

        // Print out output
        System.out.println("Your income:\t\t $" + income);
        System.out.println("Your tax bracket:\t " + taxBracket + "%");
        System.out.println("Your tax amount:\t $" + taxesAsInt);
    }
}
