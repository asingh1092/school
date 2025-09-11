/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  10
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.ten;

import java.util.Scanner;

/**
 *  This class is used to test the Triangle class
 */
public class TestTriangle {

    // Main method
    public static void main(String[] args) {
        // Variables
        Scanner s = new Scanner(System.in);
        String another = "y";

        while (another.equalsIgnoreCase("y")) {
            // create default triangle
            Triangle defaultTriangle = new Triangle();

            System.out.print("Please enter the side1 of myTriangle (a double value): ");
            double side1 = s.nextDouble();
            System.out.print("Please enter the side2 of myTriangle (a double value): ");
            double side2 = s.nextDouble();
            System.out.print("Please enter the side3 of myTriangle (a double value): ");
            double side3 = s.nextDouble();

            // Create myTriangle
            Triangle myTriangle = new Triangle(side1, side2, side3);

            // Set filled
            System.out.print("Please enter if myTriangle is filled (boolean true or false): ");
            boolean isFilled = s.nextBoolean();
            myTriangle.setFilled(isFilled);

            // Consume new line
            s.nextLine();

            // Set color
            System.out.print("Please enter the color of myTriangle (string with first letter capitalized): ");
            String color = s.nextLine();
            myTriangle.setColor(color);

            System.out.println();

            // defaultTriangle get values
            System.out.println("defaultTriangle date created: " + defaultTriangle.getDateCreated());
            System.out.println("defaultTriangle side1 value: " + defaultTriangle.getSide1());
            System.out.println("defaultTriangle side2 value: " + defaultTriangle.getSide2());
            System.out.println("defaultTriangle side3 value: " + defaultTriangle.getSide3());
            System.out.println("defaultTriangle area: " + defaultTriangle.getArea());
            System.out.println("defaultTriangle perimeter: " + defaultTriangle.getPerimeter());
            System.out.println("defaultTriangle is filled?: " + defaultTriangle.isFilled());
            System.out.println("defaultTriangle  color: " + defaultTriangle.getColor());
            System.out.println();

            // Super's toString called
            System.out.println(defaultTriangle);
            // toString method called
            System.out.println(defaultTriangle.toString("defaultTriangle"));

            // myTriangle Get values
            System.out.println("myTriangle date created: " + myTriangle.getDateCreated());
            System.out.println("myTriangle side1 value: " + myTriangle.getSide1());
            System.out.println("myTriangle side2 value: " + myTriangle.getSide2());
            System.out.println("myTriangle side3 value: " + myTriangle.getSide3());
            System.out.println("myTriangle area: " + myTriangle.getArea());
            System.out.println("myTriangle perimeter: " + myTriangle.getPerimeter());
            System.out.println("myTriangle is filled?: " + myTriangle.isFilled());
            System.out.println("myTriangle  color: " + myTriangle.getColor());
            System.out.println();

            // Super's toString called
            System.out.println(myTriangle);
            // toString method called
            System.out.println(myTriangle.toString("myTriangle"));

            System.out.print("Enter another round of values (y/n)? ");
            another = s.nextLine();
        }
    }
}
