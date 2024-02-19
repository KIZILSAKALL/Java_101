package Java_101;
import java.util.*;

public class Arrays2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //TASK1 "Find max and min"
        //TASK2 "Enter a number and find closest max end min numbers to the entered number."


        int[] list={15,12,788,1,-1,-778,2,0};

        int max=list[0];
        int min=list[0];

        for(int i: list ){
            if(i<min){
                min=i;
            }

            if(i>max){
                max=i;
            }

        }

       
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

        System.out.print("Enter a number: ");
        int number=scan.nextInt();

        int [] list2=new int[list.length+1];

        for (int i = 0; i < list.length; i++) {
            list2[i]=list[i];
        }
        list2[list.length]=number;

        Arrays.sort(list2);


        
        for(int i=0; i < list2.length; i++){

            if(list2[i]==number){
                System.out.println("The nearest number less than the entered number : " +list2[i-1]);
                System.out.println("The nearest number greater than the entered number is : "+list2[i+1]);   
            }
        }

      



    }
    
}
