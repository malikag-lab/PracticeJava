/*Write a program that takes three numbers as input from the user and prints
their average. */
import java.util.*;
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        double value1=sc.nextDouble();
         System.out.print("Please Enter the Second Number: ");
        double value2=sc.nextDouble();
         System.out.print("Please Enter the Third Number: ");
        double value3=sc.nextDouble();

        double average=(value1+value2+value3)/3;
        System.out.printf("The Average of the three numbers entered is: %.2f%n", average);
    }
}
