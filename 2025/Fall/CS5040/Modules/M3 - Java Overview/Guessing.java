// Guessing.java
import java.util.*;
public class Guessing
{
   public static void main (String[] args)
   {
      final int MAX = 10;
      int answer, guess;
      Scanner scan = new Scanner (System.in); //scanner object
      Random generator = new Random(); //number generator object 
      answer = generator.nextInt(MAX) + 1; //generate a number
      System.out.print ("I'm thinking of a number between 1" + "and " + MAX + ". Guess what it is: ");
      guess = scan.nextInt(); //read user input
      if (guess == answer)
         System.out.println ("You got it! Good guessing!");
      else
      {
         System.out.println ("That is not correct!");
         System.out.println ("The number was " + answer);
      }
   }
}
