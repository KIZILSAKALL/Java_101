package Java_101;
import java.util.*;
public class leapYear {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.print("Please enter any year: ");
        int year=scan.nextInt();

        if(year%400==0 || year%4==0 && year%100 !=0){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year");
        }


        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                    System.out.print(i + j);
            }
        }


    }

    
}
