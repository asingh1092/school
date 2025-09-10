/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  8
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.eight;

import java.util.Scanner;

/**
 *  This class is used to test the Rectangle class
 */
public class TestRectangle {

    // Main method
    public static void main(String[] args) {
        // Variables
        Scanner s = new Scanner(System.in);
        String another = "y";

        while (another.equalsIgnoreCase("y")) {
            // Variables
            double width = 0;
            double height = 0;

            // create default rectangle
            Rectangle myRectangle = new Rectangle();

            // create Rectangles
            System.out.print("Please enter the width of rectangle#1: ");
            width = s.nextDouble();
            System.out.print("Please enter the height of rectangle#1: ");
            height = s.nextDouble();

            Rectangle hisRectangle = new Rectangle(width, height);

            System.out.print("Please enter the width of rectangle#2: ");
            width = s.nextDouble();
            System.out.print("Please enter the height of rectangle#2: ");
            height = s.nextDouble();

            // Clear leftover newline
            s.nextLine();

            Rectangle herRectangle = new Rectangle(width, height);

            // Print out relevant information
            System.out.println();
            myRectangle.toString("myRectangle");
            hisRectangle.toString("hisRectangle");
            herRectangle.toString("herRectangle");

            System.out.println("myRectangle");
            System.out.println(myRectangle);
            System.out.println();

            System.out.println("hisRectangle");
            System.out.println(hisRectangle);
            System.out.println();

            System.out.println("herRectangle");
            System.out.println(herRectangle);
            System.out.println();

            // Test other functions on herRectangle
            System.out.println("Width: " + Rectangle.format(herRectangle.getWidth()));
            System.out.println("Height: " + Rectangle.format(herRectangle.getHeight()));
            System.out.println("Area: " + Rectangle.format(herRectangle.getArea()));
            System.out.println("Perimeter: " + Rectangle.format(herRectangle.getPerimeter()));


            System.out.println();
            System.out.print("Enter another round of values (y/n)? ");
            another = s.nextLine();
        }
    }

}
