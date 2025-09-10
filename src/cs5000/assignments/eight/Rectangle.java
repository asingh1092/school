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

/**
 *  This class is to create the properties and behaviors of a Rectangle object
 */
public class Rectangle {

    // Member variables (props)
    private double width = 1.00;
    private double height = 1.00;


    // Constructors
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Invalid value. Please enter a height and width larger than 0.");
        } else {
            this.width = width;
            this.height = height;
        }
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Behaviors
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    public static String format(double value) {
        return String.format("%.2f", value);
    }

    // Print method
    public void toString(String objectName) {
        System.out.println("Rectangle " + objectName + " is " + width + " units wide and " + height + " units high");
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "--------------" +
                "\nWidth:\t\t " + format(width) +
                "\nHeight:\t\t " + format(height) +
                "\nArea:\t\t " + format(getArea()) +
                "\nPerimeter:\t " + format(getPerimeter());
    }


    // Small test
    public static void main(String[] args) {
        Rectangle abc = new Rectangle(15.0, 20.0);
        abc.toString("ABC");
        System.out.println(abc);
    }
}
