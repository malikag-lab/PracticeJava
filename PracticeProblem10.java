//Take an integer and check whether it is divisible by both 3 and 5 using a ternary operator.
import java.util.*;
public class PracticeProblem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int num=sc.nextInt();
        boolean value=(num%3==0 && num%5==0)?true:false;
        System.out.println("Is the Number Entered Divisible by both 3 and 5: "+value);
           
    }
}
