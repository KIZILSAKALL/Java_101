package Java_101;
import java.util.*;
public class triangleWithStars {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        //TASK1//

        System.out.print("Enter a number: ");
        int number=scan.nextInt();

        for (int i = 0; i <=number; i++) {
            for (int j = 0; j <number-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i+1; k++) {
                System.out.print("*");
            }
            
             System.out.println();
        }



        //TASK2//

        System.out.print("Enter a number and look at the diamond: ");
        int n=scan.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
                
            } 

              int m=n;
            for (int i = 1; i <=n; i++) {
                for (int j = 0; j < i ; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2*m-1 ; k++) {
                    System.out.print("*");
                    m--;
                }
                System.out.println();
                
            } 
            


    }


    
}
