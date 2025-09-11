// Scanner is stored in java.util package
import java.util.Scanner; 
public class ComputeAreaWithCnsoleInput 
{
   public static void main(String[] args)
   {  //create a Scanner object
      Scanner input = new Scanner(System.in);
   
      //Prompt the user to enter a radius
      System.out.print("Enter a number for radius (double): ");
      double radius = input.nextDouble();
         
      //Compute area
      double area = radius * radius * 3.14159; 
          
      //Display results
      System.out.println("The area for the circle of radius " + radius + " is " + area);
   }
}