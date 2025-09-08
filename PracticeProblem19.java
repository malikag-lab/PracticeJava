//Take a number and check if it is a palindrome (same forward and backward).
import java.util.*;
public class PracticeProblem19 {
    void isPalindrome(int num){
       if(num<0){
        System.out.println("The Number Entered is Negative");
       }
       else{
       int temp=num,reverse=0;
       while(num!=0){
        int value=num%10;
        reverse=reverse*10+value;
        num=num/10;
       }
       if(temp==reverse){
        System.out.println("The Number is a Palindrome");
       }
       else{
        System.out.println("The Number is not a palindrome");
       }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number you wish to check: ");
        int num=sc.nextInt();
        PracticeProblem19 obj=new PracticeProblem19();
        obj.isPalindrome(num);
    }
}
