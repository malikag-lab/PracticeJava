//Take two numbers as input and print their sum, difference, product, and quotient.
import java.util.*;
class Example{
   void PrintSum(int num1, int num2){
    System.out.println("The Sum of both the numbers is: "+(num1+num2));
    System.out.println();
   }

   void PrintDiff(int num1, int num2){
    if(num1>num2){
        System.out.println("The Difference of both the numbers is: "+(num1-num2));
        System.out.println();
        System.out.println("The Quotient of both the numbers is: "+(num1/num2));
        System.out.println();
        
    }
    else{
        System.out.println("The Difference of both the numbers is: "+(num2-num1));
        System.out.println();
        System.out.println("The Quotient of both the numbers is: "+(num2/num1));
        System.out.println();
    }
   }

   void printMultiply(int num1, int num2){
    System.out.println("The Product of both the numbers is: "+(num1*num2));
   }

}
public class PracticeProblem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2=sc.nextInt();

        Example obj=new Example();
        obj.PrintSum(num1,num2);
        obj.PrintDiff(num1, num2);
        obj.printMultiply(num1, num2);
    }
}
