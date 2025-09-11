/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  8
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.eight;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *  This class is used to test the Account class
 */
public class TestAccount {

    // Main method
    public static void main(String[] args) {
        // Variables
        Scanner s = new Scanner(System.in);
        String another = "y";
        NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();

        // create new account object
        Account myObject = new Account(123456, 10000);

        // set interest rate to 2.5%
        myObject.setAnnualInterestRate(0.025);

        // withdraw $3500
        myObject.withdraw(3500);

        // deposit $500
        myObject.deposit(500);

        // Print out account balance;
        System.out.println("Balance: " + currencyFmt.format(myObject.getBalance()));

        // Print out account earned monthly interest;
        System.out.println("Earned monthly interest: " + currencyFmt.format(myObject.getMonthlyInterest()));

        // Print out date account created;
        System.out.println("Date account created: " + myObject.getDateCreated());

        // Print out myObject
        System.out.println(myObject);

        while (another.equalsIgnoreCase("y")) {
            // variables
            double initialBalance = 0.0;
            double interestRate = 0.0;

            // Create account #1
            System.out.print("Please enter account #1's initial balance (in dollars): ");
            initialBalance = s.nextDouble();
            System.out.print("Please enter account #1's interest rate (as a decimal, i.e 2.5% = 0.025): ");
            interestRate = s.nextDouble();

            Account myAccount = new Account(123123, initialBalance);
            myAccount.setAnnualInterestRate(interestRate);

            // Account 1's information:
            System.out.println(myAccount);

            // Create account #2
            System.out.print("Please enter account #2's initial balance (in dollars): ");
            initialBalance = s.nextDouble();
            System.out.print("Please enter account #2's interest rate (as a decimal, i.e 2.5% = 0.025): ");
            interestRate = s.nextDouble();

            // Clear leftover newline
            s.nextLine();

            Account yourAccount = new Account(123123, initialBalance);
            yourAccount.setAnnualInterestRate(interestRate);

            // Account 2's information:
            System.out.println(yourAccount);

            // Test other methods for account 2
            // withdraw $3500
            yourAccount.withdraw(3000);

            // deposit $1000
            yourAccount.deposit(1000);

            // Print out account balance;
            System.out.println("Balance: " + currencyFmt.format(yourAccount.getBalance()));

            // Print out account earned monthly interest;
            System.out.println("Earned monthly interest: " + currencyFmt.format(yourAccount.getMonthlyInterest()));

            // Print out date account created;
            System.out.println("Date account created: " + yourAccount.getDateCreated());

            System.out.println();
            System.out.print("Re-run with different values (y/n)?: ");
            another = s.nextLine();
        }

    }
}
