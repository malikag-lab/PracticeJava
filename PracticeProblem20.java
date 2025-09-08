//Take 10 numbers in an array and print the second largest element.
import java.util.*;
public class PracticeProblem20 {
    void GetSecondLargest(int[] arr){
        int n=arr.length;
        int largest=-1,secondlargest=-1;

        //Finding the Largest Element first
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }

        System.out.println("The Second Largest Number is: "+secondlargest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number of elements you wish to insert: ");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Please Enter the Elements below: ");
        for(int i=0;i<num;i++){
            System.out.print("Please Enter the "+i+" Element: ");
            arr[i]=sc.nextInt();
        }
        PracticeProblem20 obj=new PracticeProblem20();
        obj.GetSecondLargest(arr);
    }
}
