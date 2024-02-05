package Java_101;

import java.util.*;

public class weather {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Please enter weather temperature: ");
        int temperature=scan.nextInt();

        if(temperature<5){
            System.out.println("You can ski.");
        }else if(temperature > 5 && temperature<15){
            System.out.println("You can go cinema.");
        }else if(temperature > 15 && temperature<25){
            System.out.println("You can have a picnic.");
        }else{
            System.out.println("You can swim.");
        }
    }    
}
