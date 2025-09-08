//Take two numbers as input and check which one is greater using the > operator.
import java.util.*;
public class PracticeProblem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the First Number: ");
        int num1=sc.nextInt();
        System.out.print("Please Enter the Second Number: ");
        int num2=sc.nextInt();
        
        if(num1>num2){
            System.out.println("The Greater number is: "+num1);
        }
        else{
            System.out.println("The Greater number is: "+num2);
        }

    }
}
