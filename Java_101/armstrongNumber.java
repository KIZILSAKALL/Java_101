package Java_101;
import java.util.*;
public class armstrongNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        //TASK1//

        int sum=0;
        int numOfDig=0;
        int remainder;
        int sumOfRemainder=0;
        int remainderValue=1;

        System.out.print("Please enter any number and learn is it armstrong number: ");
        int isArmstrongNumber=scan.nextInt();
        int firstclone=isArmstrongNumber;

        while(firstclone !=0){
            firstclone /=10;
            numOfDig++;
        }

        firstclone=isArmstrongNumber;

        while(firstclone !=0){
            remainder=firstclone%10;
            for (int i = 0; i < numOfDig; i++) {
                remainderValue*=remainder;
            }
            sumOfRemainder+=remainderValue;
            remainderValue=1;
            firstclone/=10;
        }

        if(sumOfRemainder==isArmstrongNumber){
            System.out.println("Yes "+isArmstrongNumber+" is armstrong number.");
        }else{
            System.out.println("No "+isArmstrongNumber+" is not armstrong number.");

        }


        //TASK2//
        System.out.print("Please enter any number and learn it's sum of digit values: ");
        int number=scan.nextInt();

        int sumOfDigit=0;
        int remainderDigit;

        while(number !=0){
             remainderDigit=number%10;
             sumOfDigit+=remainderDigit;
             number/=10;
        }
        System.out.println("Sum of digit values: "+ sumOfDigit);


    }
    
}
