//Print the multiplication table of a given number using for.
import java.util.*;
public class PracticeProblem11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int num=sc.nextInt();
        System.out.println("The Multiplication Table of the Given Number is: ");
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }

    }
}
