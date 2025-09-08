//Take a number and print factorial using do-while.
import java.util.*;
public class PracticeProblem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int num=sc.nextInt();
        int i=num,factorial=1;
        if(num>0){
        do{
            factorial= factorial*i;
            i--;
        }
        while(i>0);
        System.out.println("Factorial is: "+factorial);
    }

else{
    System.out.println("Factorial Not Defined for Negative Numbers");
}
}
}
