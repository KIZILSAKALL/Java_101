package Java_101;
import java.util.*;
public class sort {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Our programme sort numbers from large to small you type.Please enter three numbers.");

        System.out.print("Enter first number: ");
        int firstNum=scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNum=scan.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum= scan.nextInt();


        if(firstNum>secondNum && secondNum>thirdNum){
            System.out.println(firstNum+" > "+secondNum+" > "+thirdNum);

        }else if(firstNum>thirdNum && thirdNum>secondNum){
            System.out.println(firstNum+" > "+thirdNum+" > "+secondNum); 

        }else if(secondNum>firstNum && firstNum>thirdNum){
            System.out.println(secondNum+" > "+firstNum+" > "+thirdNum); 

        }else if(secondNum>thirdNum && thirdNum>firstNum){
            System.out.println(secondNum+" > "+thirdNum+" > "+firstNum); 

        }else if(thirdNum>firstNum && firstNum>secondNum){
            System.out.println(thirdNum+" > "+firstNum+" > "+secondNum); 

        }else if(thirdNum>secondNum && secondNum>firstNum){
            System.out.println(thirdNum+" > "+secondNum+" > "+firstNum); 
        }
    }
}
