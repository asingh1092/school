// Demonstrates the use of a for loop to print multiples of a number
import java.util.Scanner;
public class Multiples
{
   public static void main (String[] args)
   {
      final int PER_LINE = 5;
      int value, limit, multiple, count = 0;
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter a positive value: ");
      value = scan.nextInt();
      System.out.print ("Enter an upper limit: ");
      limit = scan.nextInt();
      System.out.println ();
      System.out.println ("The multiples of " + value + " between " +
                   value + " and " + limit + " (inclusive) are:");
      for (multiple = value; multiple <= limit; multiple = multiple + value)
      {
         System.out.print (multiple + "\t");
         // Print a specific number of values per line of output
         count = count + 1;
         if (count % PER_LINE == 0)
            System.out.println(); // go to next line 
      }
   }
}
