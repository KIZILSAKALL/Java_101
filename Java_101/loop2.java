package Java_101;
import java.util.*;
public class loop2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        //Task1//
        int numbers;
        int sum=0;
        System.out.println("Enter numbers: ");        
        do {
        numbers= scan.nextInt();
         if(numbers%2==1){
            sum+=numbers;
         }   
        }while(numbers>0);

        System.out.println(sum);


        //TASK2//
        int evenNumbers;
        int evenSum=0;
        System.out.println("Enter even numbers: ");
        
        do{
            evenNumbers=scan.nextInt();
            if(evenNumbers%4==0){
                evenSum+=evenNumbers;
            }

        }while(evenNumbers%2==0);

        System.out.println(evenSum);



    }
}
