package cs5000.setupjavaandide.knowyouride;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        int miles;
        double gallons, mpg;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of miles: ");
        miles = scan.nextInt();

        System.out.println("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        mpg = miles / gallons;
        System.out.println("Miles per gallon: " + mpg);
    }
}
