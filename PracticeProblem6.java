//Take three numbers as input and find the largest using logical operators (&&)

import java.util.Scanner;

public class PracticeProblem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int num2=sc.nextInt();
        System.out.print("Please Enter the Third Number: ");
        int num3=sc.nextInt();

        if ((num1>num2) &&(num1>num3)){
            System.out.println("The Largest Number is: "+num1);
        }
        else if((num2>num1)&&(num2>num3)){
           System.out.println("The Largest Number is: "+num2);
        }
        else{
            System.out.println("The Largest Number is: "+ num3);
        }

    }
}
