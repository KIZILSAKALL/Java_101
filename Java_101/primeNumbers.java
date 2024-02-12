package Java_101;
import java.util.*;
public class primeNumbers {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        for (int i = 2; i <=100; i++) {
            
            boolean isPrime=true;

            for (int j = 2; j < i; j++) {
                if(i%j ==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
    
}
