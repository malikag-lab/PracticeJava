/*Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2.*/
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Radius: ");
        double radius=sc.nextDouble();
 
        final double PI=3.14;
        double Area=PI*radius*radius;

        System.out.println("The Area of Circle is: "+Area);
    }
    

}
