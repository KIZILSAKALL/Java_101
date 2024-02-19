package Java_101;
import java.util.*;
public class Arrays1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        //TASK1 "AVERAGE OF ARRAY" and "HARMONİC AVERAGE CALCULATE"

        System.out.print("Enter how many numbers in array do you want:");        
        int num=scan.nextInt();

        double sum=0;
        int[] arr=new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }

        double average=sum/num;

        System.out.println("Average of the numbers: "+average);


        double sum2=0;

        for (int i = 0; i < arr.length; i++) {
            sum2+=1.0/(i+1);
        }

        System.out.println(sum2);
        double harmonicAverage=arr.length/sum2;

        System.out.println("Harmonic average: "+harmonicAverage);


    }
}
