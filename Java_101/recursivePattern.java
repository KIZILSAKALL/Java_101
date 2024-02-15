package Java_101;
import java.util.*;

public class recursivePattern {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter any number: ");
        int number=scan.nextInt();
        pattern(number);

    }

    public static void pattern(int number){
        int cloneNumber=number;

        if(number>=0){
            System.out.print(number+" ");
            if(number==0){
                return;
            }
            pattern(number-5);
        }
        
        if(number<=0){
            System.out.print(number+" ");
            return;
        }
        if(number<=0){
            System.out.print(number+" ");
            pattern(number+5);
          
        }
        if(number==cloneNumber){
            System.out.print(number+" ");
            return;
        }
    }
    
}
