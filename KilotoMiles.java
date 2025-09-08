/*Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371. */
import java.util.*;
public class KilotoMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the distance in Kilometeres: ");
        double kilometers=sc.nextDouble();
        double miles=kilometers*0.621371;
        System.out.printf("%.2f Kilometers converted to Miles is: %.2f%n", kilometers, miles);
        
    }
}
