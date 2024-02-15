package Java_101;
import java.util.*
;
public class MaxMin {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);

        System.out.println("Which one do you want ? \n1)Find max\n2)Find min");
        int select=scan.nextInt();

        System.out.print("How many numbers do you want to enter:");
        int howMany=scan.nextInt();


        if(select==1){
            int max=0;

            for (int i = 0; i < howMany ; i++) {
                System.out.print("Number "+(i+1)+": ");
                int numbers=scan.nextInt();
                if(numbers>max){
                max=numbers;   
                }
            }
            System.out.println("The maximum number: "+max);
    
        }else if(select==2){
            int min=0;
            int min2=0;

            for (int i = 0; i < howMany; i++) {
                System.out.print("Number "+(i+1)+": ");
                int numbers=scan.nextInt();
                if(numbers<min){
                    min2=numbers;
                }
                min=numbers;
            }
            System.out.println("The minimum number: "+min2);
        }

       
       
        

    }

    
}
