package Java_101;
import java.util.*;
public class Atm {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        String userName,password;
        int right=3;
        int balance=1500;
        int select;

        while(right >0){
            System.out.print("Username: ");
        userName=scan.nextLine();

        System.out.print("Password: ");
        password=scan.nextLine();

            if(userName.equals("patika")&& password.equals("dev123")){
                System.out.println("You have logged into the system.");
               do{
                System.out.println("1-)İNVESTMENT \n2)WITHDRAWALS\n3)INQUİRE ABOUT THE BALANCE\n4)EXIT: ");
                System.out.print("Please select the operation you want to perform: ");

                select=scan.nextInt();

                if(select==1){
                    System.out.print("The amount of money: ");
                    int price=scan.nextInt();
                    balance+=price;
                }else if(select==2){
                    System.out.print("Amount of money: ");
                    int price=scan.nextInt();
                    if(price>balance){
                        System.out.println("Insufficient balance.");
                    }else{
                        balance -=price;
                    }
                }else if(select==3){
                    System.out.println("Your balance: "+balance+" $");
                }

               } while(select !=4);

               System.out.println("See you later...");

                break;
            }else{
                right--;
                System.out.println("Wrong username or password ! Please try again.");

                if(right==0){
                    System.out.println("Your account has been blocked, please contact the bank.");
                }
                System.out.println("Your remaining right: "+right);
            }
        }

        





    }
    
}
