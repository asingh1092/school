public class TestPassByValue {
   public static void main (String[] arge){
      int num1 = 1;
      int num2 = 2;
      System.out.println("Before calling Swap: num1 = " + num1 +
         "  num2 = " + num1 + "\n");
      swap(num1, num2);
      System.out.println("After calling Swap:  num1 = " + num1 +
         "  num2 = " + num2 + "\n");  
   }

   public static void swap(int n1, int n2){ // method swap
      System.out.println("Inside swap, before Swapping : n1 = " +
          n1 + "  n2 = " + n1 + "\n");
      int temp = n1;
      n1 = n2;
      n2 = temp;
      System.out.println("Inside swap, after Swapping:   n1 = " +
          n1 + "  n2 = " + n2 + "\n");  
   }
}
