package Java_101;
import java.util.Scanner;
public class circleAreaAndCirc {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Please enter radius of circle: ");
        int radius=scan.nextInt();

        double area=Math.PI*radius*radius;
        double circumference=2*Math.PI*radius;

        System.out.println("The area of circle: "+area);
        System.out.println("The circumference of circle: "+circumference);


System.out.println();


         System.out.println("Please enter radius and the measure of the center angle of circle: ");
         
         System.out.print("radius: ");
         int radius2=scan.nextInt();

         System.out.print("Angle: ");
         int angle=scan.nextInt();

         double area2=(Math.PI*radius2*radius2*angle)/360.0;
         System.out.println("The area of circle slice: "+area2);
    }
    
}
