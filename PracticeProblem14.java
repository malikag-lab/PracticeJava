//Store an array of 5 integers and print them using a for-each loop.
import java.util.*;
public class PracticeProblem14 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Please Enter the Size of the Array: ");
       int size=sc.nextInt();
       int arr[]=new int[size];
       for(int i=0;i<size;i++){
           System.out.print("Please Enter the Array Element "+i+": ");
           arr[i]=sc.nextInt();
       }
       System.out.println("The Elements stored in the Array are: ");
       for(int j:arr){
         System.out.println(j+" ");
       }
    }
    


}
