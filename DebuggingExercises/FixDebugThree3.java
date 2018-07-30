// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3
{
   public static void main(String args[])
   {
      String name = getName();
      displayGreeting(name);
   }
   public static String getName()
   {
      String theName;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name: " );
      theName = input.nextLine();
      return theName;
   }
   public static void displayGreeting(String displayName)
   {
      System.out.println("Hello, " + displayName + "!");
   }
}
