/*Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit */
import java.util.*;
public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Temperature in Celsius: ");
        double Celsius=sc.nextDouble();
        double Farenheit=(Celsius * 9.0/5.0) + 32;
        System.out.println("The Temperature converted in Farenheit is: "+Farenheit);

    }
}
