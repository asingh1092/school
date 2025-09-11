// demonstrate continue statement
public class TestContinue {
   public static void main(String[] args) {
      int sum = 0;
      int number = 0;
   
      while (number < 10) 
      {
         number = number + 1;
         if (number == 5 || number == 6) 
            continue;  // do not add 5 and 6 to sum
         sum = sum + number;
      }
        
      System.out.println("The number is " + number);
      System.out.println("The sum is " + sum);    
   }
}
