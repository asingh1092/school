// demonstrate break statement
public class TestBreak {
   public static void main(String[] args) {
      int sum = 0;
      int number = 0;
   
      while (number < 20)
      {
         number = number + 1;
         sum = sum + number;
         if (sum >= 100)  // stop if sum is over 100
            break;
      }
   
      System.out.println("The number is " + number);
      System.out.println("The sum is " + sum);
   }
}
