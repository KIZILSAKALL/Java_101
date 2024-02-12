package Java_101;
import java.util.*;
public class invertedTriangle {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("We want to a inverted triangle. So you enter number of digits: ");
        int n=scan.nextInt();
        

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
