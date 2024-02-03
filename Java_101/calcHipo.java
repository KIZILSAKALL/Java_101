package Java_101;
import java.util.*;

import java.util.Scanner;

public class calcHipo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter edges length of triangle: ");

        System.out.print("Please enter length of first edge: ");
        int edge1=scan.nextInt();

        System.out.print("Please enter length of second edge: ");
        int edge2=scan.nextInt();

        System.out.print("Please enter length of third edge: ");
        int edge3=scan.nextInt();

        int circumference=edge1+edge2+edge3;
        int u= circumference/2;
        
        double area=Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
        System.out.println("Your triangle's area is "+area);
        
    }
}
