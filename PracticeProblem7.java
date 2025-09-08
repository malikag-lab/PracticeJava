/*Take marks as input and print the grade using if-else: (90+ → A, 75–89 → B, 50–74 → C,
below 50 → Fail).*/
import java.util.*;
public class PracticeProblem7 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter your Marks: ");
    int marks=sc.nextInt();

    if(marks>=90){
      System.out.println("The Grade is : A ");
    }
    else if((marks >=75 && marks<=89 )){
        System.out.println("The Grade is : B ");
    }
    else if((marks >=50 && marks<=74 )){
        System.out.println("The Grade is : C ");
    }
    else{
        
        System.out.println("The Grade is : Fail ");
    
    }
 }   
}
