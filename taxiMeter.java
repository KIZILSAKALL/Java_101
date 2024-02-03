import java.util.Scanner;
public class taxiMeter {
    public static void main(String[] args){

    Scanner scan=new Scanner(System.in);

    System.out.print("Please enter Distance: ");
    int distance=scan.nextInt();

    double cost= 10+distance*2.20;

    boolean limit= cost>=20;

    double cost2= limit ? cost:20;
    System.out.println("Your taxi fare: "+cost2);

    }
    
}
