/*Write a program to take a user’s name and age as input and print: "Hello , you are years
old */
import java.util.*;
public class PracticeProblem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name=sc.nextLine();
        System.out.println();
        System.out.print("Please Enter your Age: ");
        int age=sc.nextInt();

        System.out.println("Hello "+name+", you are "+age+" years old");
    }
}
