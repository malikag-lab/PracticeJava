//Take a character input and check whether it is a vowel or consonant using switch.

import java.util.*;

public class PracticeProblem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Character: ");
        char ch=sc.next().charAt(0);
        
        if(Character.isLetter(ch)){
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" is a vowel");
                break;
            default:
                System.out.println(ch+" is a consonant");
                break;
        }
 
   }
   else{
    System.out.println(ch+" is not a letter");
   }
}
}
