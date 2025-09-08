/*Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:
Perimeter = 2 * (length + width). */
import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please Enter the Length of the Rectangle: ");
    double length=sc.nextDouble();
    System.out.print("Please Enter the Width of the Rectangle: ");
    double width=sc.nextDouble();
    double perimeterRectangle=2*(length+width);
    System.out.println("The Perimeter of the Rectangle is: "+perimeterRectangle);
    }
}
