//Write a program to calculate the square and cube of a number using the * operator.
import java.util.*;
class Example3{
   void CalculateSquare(int num){
    int Square=num*num;
    System.out.println("The Square of the Number is: "+Square);
   }
   void CalculateCube(int num){
    int cube=num*num*num;
    System.out.println("The Cube of the Number is: "+cube);
   }
}
public class PracticeProblem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num=sc.nextInt();

        Example3 obj= new Example3();
        obj.CalculateSquare(num);
        obj.CalculateCube(num);
        
    }
}
