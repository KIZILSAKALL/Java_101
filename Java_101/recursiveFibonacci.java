package Java_101;
import java.util.*;
public class recursiveFibonacci {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a number how many you want to look fibonacci numbers: ");
        int number=scan.nextInt();
       System.out.println(f(number));
    }

    public static int f(int n){
        if(n==1 || n==2){
            return 1;
        }

        return f(n-1)+f(n-2);
    }
    
}
