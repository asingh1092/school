package cs5000.assignments.ten.austin;

// Class: CS 5000
// Term: Summer 2025
// Name: Austin Krusemark
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: IntellJ



import java.util.Scanner;

public class testTriangl {

    public static void main(String[] args) {
    /*
    Here is where we set up our two scanners (one for the inputted numbers and the other
    for our sentinel value/strings) as well as our variable for the sentinel value itself
     */
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String runAgain;
        System.out.println("Hello! We're going to make a triangle object today!");
        System.out.println("I'll make one for you just to showcase how it looks!");
        Triangle myTriangle = new Triangle();
        System.out.println("My triangle was created on " +myTriangle.getDateCreated());
        System.out.println("The sides are " +myTriangle.getSide1()+ ", " +myTriangle.getSide2()+ ", and " +myTriangle.getSide3());
        System.out.println("Now let's use the toString() method to get some more basic details");
        System.out.println(myTriangle);
        System.out.println();
        System.out.println("Now it's your turn!");
        System.out.println();
        do{
            double side1 = 0;
            double side2 = 0;
            double side3 = 0;
            Triangle yourTriangle = new Triangle(side1, side2, side3);
            while(side1<=0){
                System.out.print("Please put in a non-negative value for side1 of your triangle: ");
                side1=scan.nextDouble();
                yourTriangle.setSide1(side1);
            }
            System.out.println();
            while(side2<=0){
                System.out.print("Please put in a non-negative value for side2 of your triangle: ");
                side2=scan.nextDouble();
                yourTriangle.setSide2(side2);
            }
            System.out.println();
            while(side3<=0){
                System.out.print("Please put in a non-negative value for side3 of your triangle: ");
                side3=scan.nextDouble();
                yourTriangle.setSide3(side3);
            }

            System.out.println();
            System.out.print("What color would you like your Triangle to be: ");
            String color = scan2.nextLine();
            yourTriangle.setColor(color);

            System.out.println();

            System.out.print("Is your triangle filled (Y/N): ");
            String filled = scan2.nextLine();
            if(filled.equalsIgnoreCase("Y")){
                yourTriangle.setFilled(true);
            } else {
                yourTriangle.setFilled(false);
            }
            System.out.println();

            System.out.print("Triangle:\t\tyourTriangle");
            System.out.println(yourTriangle);
            System.out.println();


        /*
        Here is where the user is given the option to try again with another array, which if they
        say "Y" or "y", the program will run again
         */
            System.out.print("Would you like to try again with a triangle with a different side? (Y/N) \t");
            runAgain = scan2.nextLine();
            System.out.println();
        } while (runAgain.equalsIgnoreCase("Y"));

    }

}
