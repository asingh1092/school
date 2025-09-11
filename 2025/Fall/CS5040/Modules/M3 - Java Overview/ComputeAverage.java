// Scanner is stored in java.util package
import java.util.Scanner; 
public class ComputeAverage
{ 
   public static void main(String[] args)
   {
      // create a Scanner object
      Scanner input = new Scanner(System.in);
   
      // Prompt the user to enter three numbers
      System.out.print("Enter three numbers (type double): ");
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();
   
      // Compute average
      double average = (number1 + number2 + number3) / 3.0;
                
      // Display results
      System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
   }
}
