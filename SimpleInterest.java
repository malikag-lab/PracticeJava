/*Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. */
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Principal Amount: ");
        double principal=sc.nextDouble();
        System.out.print("Please Enter the Rate of Interest: ");
        double rate=sc.nextDouble();
        System.out.print("Please Enter the Time(in years): ");
        double time=sc.nextDouble();

        double SimpInterest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is: "+SimpInterest);
    }
}
