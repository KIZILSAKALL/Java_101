package Java_101;
import java.util.Scanner;
public class BodyMaxIndex {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your heigt and weight");

        System.out.print("Height(m): ");
        double height=scan.nextDouble();

        System.out.print("Weight(kg): ");
        double weight=scan.nextDouble();

        double bodyMaxIndex=weight/Math.pow(height, 2);
        System.out.print("Your body max ındex: "+bodyMaxIndex);

    }
    
}
