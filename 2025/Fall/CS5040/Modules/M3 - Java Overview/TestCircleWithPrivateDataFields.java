public class TestCircleWithPrivateDataFields {

   public static void main(String[] args) { // Main method
      
      // Create a Circle with radius 10.0
      CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(10.0);
      
      System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
   
      // Increase myCircle's radius by 10%
      myCircle.setRadius(myCircle.getRadius() * 1.1);
      System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
   }
}
