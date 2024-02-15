package Java_101;
import java.util.*;
public class Loop3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        //TASK1//
        System.out.print("Enter any number: ");
        int number=scan.nextInt();

        for (int i = 2; i <=number; i*=2) {
        
            System.out.println(i);
        }


        //TASK2//
        System.out.print("Enter any number: ");
        int number2=scan.nextInt();

        for (int i = 1; i <=number2; i++) {
            if(i%4==0 || i%5==0){
                System.out.println(i);
            }

        }
    }
}
