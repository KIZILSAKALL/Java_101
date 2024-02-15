package Java_101;
import java.util.*;
public class UserLogin {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        String username="BATUHAN";
        String password="Mimisabu9999.";

        System.out.print("Please enter your username: ");
        String isusername= scan.nextLine();

        System.out.print("Please enter your password: ");
        String isPassword= scan.nextLine();

        if(username.equals(isusername) && password.equals(isPassword)){
            System.out.println("The system has been logged in");
        }else{
            System.out.println("Your informations are false.");
        }

        if(!(password.equals(isPassword))){
            System.out.println("Your password is false. Do you want to change password ?");
            System.out.println("1)Yes\n2)False");
            int choice =scan.nextInt();

            if(choice==1){
                System.out.print("New password: ");
                String newPassword=scan.next();

                if(newPassword.equals(password)){
                    System.out.println("The password couldn't be created. Please enter another password.");
                }else{
                    System.out.println("The password could be created.");
                    password=newPassword;
                    System.out.println(password);
                }
            }

        }else{
            System.out.println("Your username is wrong !");
        }
        

        

    
    }
    
}
