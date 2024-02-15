package Java_101;
import java.util.*;
public class HarmonicSeries {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter any number and learn it's harmonic series: ");
        int number=scan.nextInt();
        double result=0;
        for (int i = 1; i<=number ; i++) {
            result+=(1.0/i);
            
        }

        System.out.println(result);


    }
    
}
