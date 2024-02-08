package Java_101;
import java.util.*;
public class loop4 {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        //TASK1//
        System.out.print("Please enter any number for calculate it's factorial: ");
        int fact=scan.nextInt();
        int result=1;

        for (int i =1;  i <=fact; i++) {
            result*=i;
        }
        System.out.println(result);



        //TASK2//
        System.out.println("We calculate combination. Enter two number C(n,r)");

        System.out.print("first number: ");
        int n=scan.nextInt();
        System.out.print("Second number: ");
        int r=scan.nextInt();

        int nFact=1;
        int rFact=1;
        int n_rFact=1;

            for (int i = 1; i <= n; i++) {
                nFact*=i;           
            }

            for (int i = 1; i <= r; i++) {
                rFact*=i;           
            }

            for (int i = 1; i <= n-r; i++) {
                n_rFact*=i;          
            }

         int combinationResult=nFact/(rFact*(n_rFact));   
         System.out.println(combinationResult);

    }
}
