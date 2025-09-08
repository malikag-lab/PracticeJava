//Take a number as input and print whether it is even or odd.
import java.util.*;
class Example2{
   void EvenOrOdd(int num){
    if(num%2==0){
        System.out.println("The Number is Even");
    }
    else{
        System.out.println("The Number is Odd");
    }
   }
}

public class PracticeProblem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the number you wish:");
        int num=sc.nextInt();

        Example2 obj=new Example2();
        obj.EvenOrOdd(num);
    }
}
