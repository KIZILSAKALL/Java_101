package Java_101;
import java.util.Scanner;
public class greengrocerCalculation {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Pear how much(kg): ");
        int pearKg=scan.nextInt();
        double pearsCost=pearKg*2.14;

        System.out.print("Apple how much(kg): ");
        int appleKg=scan.nextInt();
        double appleCost= appleKg*3.67;

        System.out.print("Tomatoes how much(kg): ");
        int tomatoesKg=scan.nextInt();
        double tomatoCost=tomatoesKg*1.11;

        System.out.print("Banana how much(kg): ");
        int bananaKg=scan.nextInt();
        double bananaCost=bananaKg*0.95;

        System.out.print("Eggplant how much(kg): ");
        int eggplantKg=scan.nextInt();
        double eggplantCost=eggplantKg*5;

        double total=pearsCost+appleCost+tomatoCost+bananaCost+eggplantCost;


        System.out.printf("Total cost: %.2f TL ",total);










        
    }
}
