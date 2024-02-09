package Java_101;
import java.util.*;
public class loop5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

    System.out.println("Calculate a^b: ");

    System.out.print("Enter a: ");
    int a=scan.nextInt();

    System.out.print("Enter b: ");
    int b=scan.nextInt();
    int result=1;
    for (int i = 0; i < b; i++) {
        result*=a;
        
    }
    System.out.println("Result: "+result);
        
    }
}
