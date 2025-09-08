//Print all prime numbers between 1 and 50 using a loop.
public class PracticeProblem15 {
public static void main(String[] args) {
  for(int num=2;num<=50;num++){
    boolean flag=true;
    for(int i=2;i<num;i++){
        if(num%i==0){
            flag=false;
            break;
        }
    }
    if(flag==true){
        System.out.println(num+" is prime");
    }
  }
}    
}
