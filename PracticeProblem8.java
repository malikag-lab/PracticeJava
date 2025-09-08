//Take a number as input and check if it is positive, negative, or zero.
import java.util.*;
public class PracticeProblem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The Number is a Postive Number");
        }
        else if (num<0){
            System.out.println("The Number is a Negative Number");
        }
        else{
            System.out.println("The Number is a Zero");
        }
    }
}
