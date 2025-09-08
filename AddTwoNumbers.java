//Write a program that takes two numbers as input from the user and prints
//their sum.
import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2=sc.nextInt();

        System.out.println("The Sum of the two numbers entered is: "+(num1+num2));
    }
}
