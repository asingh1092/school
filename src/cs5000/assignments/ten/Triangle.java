/*
 * Class:       CS 5000/W01
 * Term:        Summer 2025
 * Name:        Amrit Singh
 * Instructor:  Dr. Hisham Haddad
 * Assignment:  10
 * IDE       :  IntelliJ IDEA
 */
package cs5000.assignments.ten;

/**
 *  This class is to create the properties and behaviors of a Triangle object extending a GeometricObject
 */
public class Triangle extends GeometricObject {

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
        // default no arg constructor
    }

    public Triangle(double side1, double side2, double side3) {
        // check for valid side values
        if (isValid(side1)) {
            this.side1 = side1;
        }
        if (isValid(side2)) {
            this.side2 = side2;
        }
        if (isValid(side3)) {
            this.side3 = side3;
        }
    }

    // Getters and setters
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (isValid(side1)) {
            this.side1 = side1;
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (isValid(side2)) {
            this.side2 = side2;
        }
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (isValid(side3)) {
            this.side3 = side3;
        }
    }

    /**
     * Checks to see if value is valid for a side.
     *
     * @param val double value
     * @return boolean true or false
     */
    private boolean isValid(double val) {
        if (val <= 0) {
            System.out.println("Values less than or equal to 0 are not acceptable for a side. Using default side value of 1.0.");
            return false;
        }
        return true;
    }

    // Get area
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * ( s - side2) * (s - side3));
    }

    // Get perimeter
    @Override
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public String toString(String name) {
        return "\n\nTriangle:\t " + name +
                "\nSide 1:\t\t " + side1 +
                "\nSide 2:\t\t " + side2 +
                "\nSide 3:\t\t " + side3 +
                "\nArea:\t\t " + getArea() +
                "\nPerimeter:\t " + getPerimeter() +
                "\nColor:\t\t " + getColor() +
                "\nIs Filled:\t " + isFilled() +
                "\n\n";
    }

    // small test method
    public static void main(String[] args) {
        GeometricObject triangle = new Triangle();
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getDateCreated());
        System.out.println(triangle.getColor());
        System.out.println(triangle.isFilled());
    }
}
