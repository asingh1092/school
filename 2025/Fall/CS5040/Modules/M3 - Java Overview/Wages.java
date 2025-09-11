// Wages.java
import java.text.NumberFormat;
import java.util.Scanner;
public class Wages
{ 
   public static void main (String[] args)
   {
      final double RATE = 8.25; //regular pay rate
      final int STANDARD = 40; //weekly hours
      Scanner scan = new Scanner (System.in); //scanner object
      double pay = 0.0;  // initialization
   
      System.out.print ("Enter the number of hours worked: "); //prompt
      int hours = scan.nextInt(); //read input value
      System.out.println (); //print blank line  
      // Pay overtime at "time and a half"
      if (hours > STANDARD)
         pay = STANDARD * RATE + (hours-STANDARD) * (RATE * 1.5);
      else
         pay = hours * RATE;
       
      NumberFormat fmt = NumberFormat.getCurrencyInstance();//format
      System.out.println ("Gross earnings: " + fmt.format(pay));//output
   }
}
