package Java_101;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter how many numbers you want from fibonacci Series: ");
        int num=scan.nextInt();

        int a=0 , b=1;
    

      
        for (int i = 1; i <=num ; i++) {

            System.out.print(a+" ");

             int sum=a+b;
             a=b;
             b=sum;

            
        }

    
    }
}
