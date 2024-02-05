package Java_101;
import java.util.*;
public class calculator {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter first number: ");
        double firstNum=scan.nextDouble();

        System.out.print("Please enter second number: ");
        double secondNum=scan.nextDouble();

        System.out.println("1)Addition\n2)Extraction\n3)Multiplication\n4)Division");
        System.out.print("Your choice: ");
        int choice=scan.nextInt();

        
        double result=0;

        switch(choice){

            case 1: 
                 result=secondNum+firstNum;
                System.out.println("result: "+result);
                break;

            case 2:
                 result=firstNum-secondNum;
                System.out.println("result: "+result);
                break;
            
            case 3: 
                result= firstNum*secondNum;
                System.out.println("result: "+result);
                break;
            
            case 4: 
                result= firstNum/secondNum;
                System.out.println("result: "+result); 
                break;
                
            default :{
                System.out.println("You entered invalid choice !");    
                break;
            }
        }
    }
    
}
