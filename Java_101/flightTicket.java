package Java_101;
import java.util.*;
public class FlightTicket {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome our ticket price calculator. Please enter the following instructions.");

      System.out.print("Please enter your age: ");
      int age=scan.nextInt();

      System.out.println("1)One Way \n2)Round Trip ");
      int type=scan.nextInt();   

      System.out.print("Please enter distance(km): ");
      int km=scan.nextInt();

      double price=km*0.1;

        if(type==2){
            price= price*(80/100.0);
        }

        if(age<12){
            price/=2;
        }else if(age>=12 && age<=24){
            price=price*(90/100.0);
        }else if(age>65){
            price=price*(70/100.0);
        }else{
            price=price;
        } 

        System.out.println("Your ticket price: "+price+" $");
    }




        
}



