package Java_101;
import java.util.*;
public class ChineseZodiac {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int birth =scan.nextInt();

        int division_12= birth%12;
        
        switch(division_12){
            case 0 :
            System.out.println("Your sign is Monkey");

            case 1 :
            System.out.println("Your sign is Cock");

            case 2 :
            System.out.println("Your sign is Dog");

            case 3 :
            System.out.println("Your sign is Pigs");

            case 4 :
            System.out.println("Your sign is Mouse");

            case 5 :
            System.out.println("Your sign is Ox");

            case 6 :
            System.out.println("Your sign is Tiger");

            case 7 :
            System.out.println("Your sign is Rabbit");

            case 8 :
            System.out.println("Your sign is Dragon");

            case 9 :
            System.out.println("Your sign is Snake");

            case 10 :
            System.out.println("Your sign is Horse");

            case 11 :
            System.out.println("Your sign is Sheep");

            

            

        
        }

    }
    
}
