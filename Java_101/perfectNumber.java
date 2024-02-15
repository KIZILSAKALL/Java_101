package Java_101;
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number and learn is it perfect number: ");
        int isPerfect=scan.nextInt();

        int sum=0;

        for (int i =1; i < isPerfect; i++) {
        
            if(isPerfect%i==0){
                sum+=i;
            }
        }

        if(sum==isPerfect){
            System.out.println(isPerfect+" is a perfect number.");
        }else{
            System.out.println(isPerfect+" is not a perfect number.");
        }
    }
}
