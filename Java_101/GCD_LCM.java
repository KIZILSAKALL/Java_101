package Java_101;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);


        //TASK1//

        System.out.println("Please select one of:\n1)The Smallest Common Floor\n2)Greatest Common Divisor ");

        System.out.print("Select: ");
        int select=scan.nextInt();

        int lcm=1;
        int gcm=1;


        if(select==1){
            System.out.print("Enter n1: ");
            int n1=scan.nextInt();

            System.out.print("Enter n2: ");
            int n2=scan.nextInt();

            for (int i = 1; i <=n1*n2 ; i++) {
                if(i%n1==0 && i%n2==0){
                    lcm=i;
                    System.out.println("The least common divisor: "+lcm);
                }
            }
        }


        if(select==2){
            System.out.print("Enter n1: ");
            int n1=scan.nextInt();

            System.out.print("Enter n2: ");
            int n2=scan.nextInt();

            for (int i = 1; i <= n1; i++) {
                if(n1%i==0 && n2%i==0){
                    gcm=i;
                }
                
            }
            System.out.println("The greatest common divisor: "+gcm);

        }
        

    }
    
}
