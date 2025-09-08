//Take a string input and print characters one by one, but stop when a space is found.
import java.util.*;
public class PracticeProblem18 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter the String: ");
    String Example=sc.nextLine();

    for(int i=0;i<Example.length();i++){
        char ch=Example.charAt(i);
        if(ch==' '){
            break;
        }
        System.out.println(ch);
    }

    
     }
    
    
}
