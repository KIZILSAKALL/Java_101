package Java_101;
import java.util.*;
public class RecursivePower {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter base number = ");
        int base=scan.nextInt();

        System.out.print("Please enter to the power of = ");
        int power= scan.nextInt();

        System.out.println("Result = "+recursivePower(base, power));

    }

    public static int recursivePower(int base, int power){

      
        if(power==0){
            return 1;
        }else{
            return base*recursivePower(base,power-1);
        }
    }
} 
