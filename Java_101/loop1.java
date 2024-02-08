package Java_101;
import java.util.*;
public class loop1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Please enter any number: ");
        int number=scan.nextInt();

    for (int i = 0; i <=number; i++) {
        if(i%2==1){
            continue;
        }
        System.out.println(i);
        
    }

        
    System.out.print("Please enter any number: ");
        int number2=scan.nextInt();
        int sum=0;
        int count=0;

        for (int i = 1; i <=number2; i++){
            if(i%12==0){
                sum+=i;
                count++;
            }
            
        }
        double average= sum/count;
        System.out.println("The average of the numbers exactly divided by 3 and 4 is: "+average);
    }
    
}
