package Java_101;
import java.util.*;
public class average {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);

        int mat, phy,trk,chm,msc;


        System.out.print("Mathematic grade: ");
        mat=scan.nextInt();
        
        System.out.print("Physics grade: ");
        phy=scan.nextInt();

        System.out.print("Turkish grade: ");
        trk=scan.nextInt();

        System.out.print("Chemist grade: ");
        chm=scan.nextInt();

        System.out.print("Music grade: ");
        msc=scan.nextInt();

        if (mat >= 0 && mat <= 100 && phy >= 0 && phy <= 100 && trk >= 0 && trk <= 100 && chm >= 0 && chm <= 100 && msc >= 0 && msc <= 100) {
            double average = (mat + phy + chm + trk + msc) / 5;


        if(average <=55){
            System.out.println("You didn't pass.");
        }else{
            System.out.println("You passed.");
        }

        System.out.println("Your average: "+average);
    }


        }
    }
