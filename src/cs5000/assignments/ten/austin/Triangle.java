package cs5000.assignments.ten.austin;// Class: CS 5000
// Term: Summer 2025
// Name: Austin Krusemark
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: IntellJ

import cs5000.assignments.ten.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3){
        if(side1 <0 ){
            System.out.println("Sorry, but the number that you have inputted for " +side1+ " is an invalid one");
        } else {
            this.side1 = side1;
        }
        if(side2 <0 ){
            System.out.println("Sorry, but the number that you have inputted for " +side2+ " is an invalid one");
        } else {
            this.side2 = side2;
        }
        if(side3 <0 ){
            System.out.println("Sorry, but the number that you have inputted for " +side3+ " is an invalid one");
        } else {
            this.side3 = side3;
        }
    }
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public void setSide1(double side1){
        if(side1 <0 ){
            System.out.println("Sorry, but the number that you have inputted for " +side1+ " is an invalid one");
        } else {
            this.side1 = side1;
        }

    }
    public void setSide2(double side2){
        if(side2 <0 ){
            System.out.println("Sorry, but the number that you have inputted for " +side2+ " is an invalid one");
        } else {
            this.side2 = side2;
        }

    }
    public void setSide3(double side3){

        if(side3 <0 ){
            System.out.println("Sorry, but the number that you have inputted for " +side3+ " is an invalid one");
        } else {
            this.side3 = side3;
        }

    }

    @Override
    public double getArea(){
        double s = (this.side1 + this.side2 + this.side3)/2.0;
        double area = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = (this.side1+this.side2+this.side3);
        return perimeter;
    }
    @Override
    public String toString(){
        return "\nSide 1: \t\t" + this.side1 + "\nSide 1: \t\t" + this.side2 +"\nSide 3: \t\t" +this.side3+ "\nArea: \t\t\t" +getArea()+ "\nPerimeter:\t\t" +getPerimeter()+ "\nColor\t\t\t" + getColor()+ "\nIs Filled:\t\t" + isFilled();
    }

}