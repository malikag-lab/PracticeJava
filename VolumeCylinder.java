/*Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height. */
import java.util.*;
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Radius: ");
        double radius=sc.nextDouble();
        System.out.print("Please Enter the Height: ");
        double height=sc.nextDouble();

        final double PI=3.14;
        double volume=PI*radius*radius*height; 

        System.out.println("The Volume of Cylinder is: "+volume);
    }
        
}
