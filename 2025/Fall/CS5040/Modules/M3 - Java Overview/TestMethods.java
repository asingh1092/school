// illustration of methods in java
import java.util.*;
public class TestMethods {
   public static void main (String[] arge)
   { int a = 10, b = 20;
      int addResult = Add(a,b); //call method Add
      System.out.println("Sum of a and b is " + addResult);
           
      String myMessage = "Hello World!"; // call method PrintMessage
      printMessage(myMessage);   
   }
    
       // method definition
   public static int Add(int x, int y)
   { 
      return (x+y); }
    
       // method definition
   public static void printMessage(String message)
   { 
      for (int i = 1; i <= 5; i++)
         System.out.println(message);
   }
}
