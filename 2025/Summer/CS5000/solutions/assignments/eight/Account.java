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
import java.util.Date;

/**
 *  This class is to create the properties and behaviors of an Account object
 */
public class Account {

    // Member properties
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0; // assume all accounts have same interest rate once set
    private final Date dateCreated;

    // Formatters
    private final NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
    private final NumberFormat percentFmt = NumberFormat.getPercentInstance();


    // default constructor
    public Account() {
        this.dateCreated = new Date();
        percentFmt.setMinimumFractionDigits(1);
    }

    // constructor with id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        percentFmt.setMinimumFractionDigits(1);
    }

    // getters and setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance remaining. Current balance: " + balance);
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account ID: " + id +
                "\nAccount Balance:\t\t " + currencyFmt.format(balance) +
                "\nAnnual Interest Rate:\t " + percentFmt.format(annualInterestRate) +
                "\nMonthly Interest:\t\t " + currencyFmt.format(getMonthlyInterest()) +
                "\nDate Opened:\t\t\t " + dateCreated;
    }
}

