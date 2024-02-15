package Java_101;
import java.util.*;

public class RecursivePrime {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter any number and learn is it prime: ");
        int number= scan.nextInt();

        int divisor=number-1;
        isPrime(number, divisor);


    }

    public static boolean isPrime(int number,int divisor){

        if(number==1){
            System.out.println("1 is not a prime number");
            return false;
        }

        if(divisor <=1){
            System.out.println(number+" is a prime number.");
            return true;
        }

        if(number%divisor==0){
            System.out.println(number+" is not a prime number. ");
            return false;
        }

        return isPrime(number, divisor-1);
    }
        

    
}
