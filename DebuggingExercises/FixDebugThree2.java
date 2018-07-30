// This application displays some math facts
public class FixDebugThree2
{
   public static void main(String args[])
   {
      int a = 2, b = 5, c = 10;
      add(a, b);
      add(b, c);
      subtract(c, a);            
   }
   public static void add(int firstValue, int secondValue)
   {
      System.out.println("The sum of " + firstValue +
         " and " + secondValue + " is " + (firstValue + secondValue));
   }
   public static void subtract(int firstValue, int secondValue)
   {
      System.out.println("The difference between " +
        firstValue + " and " + secondValue + " is " + (firstValue - secondValue));
   }
}
