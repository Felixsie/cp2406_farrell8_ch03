/**
 * Created by Lenovo on 7/29/2018.
 */

import java.util.Scanner;

public class MetricConversion
{
    public static void main (String args[])
    {
        int aValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer >> ");
        aValue = input.nextInt();
        convertToCentimeters(aValue);
        convertToLiters(aValue);
    }

    public static void convertToCentimeters(int inches)
    {
        double centimeters;
        final double CENT_FACTOR = 3.7854;
        centimeters = inches * CENT_FACTOR;
        System.out.println(inches + " inches is " + centimeters + " centimeters");
    }

    public static void convertToLiters(int inches)
    {
        double liters;
        final double LITER_FACTOR = 2.54;
        liters = inches * LITER_FACTOR;
        System.out.println(inches + " inches is " + liters + " liters");
    }
}
