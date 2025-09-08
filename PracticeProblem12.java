//Print the sum of digits of a given number using while.
import java.util.*;
public class PracticeProblem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number you wish: ");
        int num=sc.nextInt();
        int sum=0,temp=num;
        while(temp>0){
            int value=temp%10;
            sum+=value;
            temp=temp/10;
        }

        System.out.println("The Sum of the Digits of the number "+num+" is: "+sum);
    }
}
