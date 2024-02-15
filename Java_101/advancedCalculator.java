package Java_101;
import java.util.*;

public class AdvancedCalculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        String menu="1- Collection Process\n"
        + "2- Extraction Process\n"
        + "3- Multiplication Operation\n"
        + "4- Division operation\n"
        + "5-Exponential Number Calculation\n"
        + "6- Factorial Calculation\n"
        + "7- Rectangular Area and Perimeter Calculation\n"
        + "0- Log Out";
        
        int selects=0;

        do{
            System.out.println(menu);
            System.out.print("Please select a transaction = ");
            select=scan.nextInt();
            switch(select){

                case 1: 
                plus();
                break;

                case 2: 
                minus();
                break;

                case 3: 
                times();
                break;

                case 4: 
                divided();
                break;

                case 5: 
                power();
                break;

                case 6: 
                factorial();
                break;

                case 7: 
                rectangle();
                break;

                case 0: 
                System.out.println("See you later...");
                break;

                default: 
                System.out.println("You enter invalid value. Please try again!");
            }   


        }while(select !=0);
    }

    public static void plus(){
        Scanner scan=new Scanner(System.in);

        int number,result=0, i=0;

        while(true){
            System.out.print("Number "+ ++i +": ");
            number=scan.nextInt();

            if(number==0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : "+ result);
    }

    public static void minus(){
        Scanner scan=new Scanner(System.in);
        int number,result=0;

        System.out.print("How many numbers do you want to enter: ");
        int counter=scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number "+i+" = ");
            number =scan.nextInt();
            if(i==1){
                result += number;
                continue;
            }
            result -=number;
        }

        System.out.println("Result = "+result);
        

    }

    public static void times(){
        Scanner scan=new Scanner(System.in);
        int number,i=1;
        int result=1;

        System.out.print("How many numbers do you want to enter: ");
        int counter=scan.nextInt();

        for (int j = 1; j <= counter; j++) {
            System.out.print("Number "+j+" = ");
            number=scan.nextInt();
            result*=number;
        }
        System.out.println("Result = "+result);

    }

    public static void divided(){
        Scanner scan=new Scanner(System.in);
        int number,counter=0;
        double result=1;

        System.out.print("Enter how many numbers do you want to enter: ");
        counter=scan.nextInt();

        for (int i = 1; i <=counter ; i++) {
            System.out.print("Number "+i+" = ");
            number=scan.nextInt();

            if(i==1){
                result*=number;
                continue;
            }

            result/=number;
        }
        System.out.println("Result = "+result);

    }

    public static void power(){
        Scanner scan=new Scanner(System.in);

        int result=1;
        
        System.out.print("Enter base = ");
        int n1=scan.nextInt();

        System.out.print("Enter to the power of = ");
        int n2=scan.nextInt();

        for (int i = 0; i < n2; i++) {
            result*=n1;
        }
        System.out.println("Result = "+result);


    }

    public static void factorial(){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter a number and look at that factorial = ");
        int number=scan.nextInt();
        int result=1;
        if(number==0 || number==1){
            System.out.println(number+"! = 1");
            return;
        }

        for (int i = 1; i <= number; i++) {  
            result*=i;
        }
        System.out.println(number+"! = "+result);
    }

    public static void rectangle(){
        Scanner scan=new Scanner(System.in);

        System.out.println("1) Circumference of rectangle\n2) Area of rectangle");
        int process=scan.nextInt();

        if(process==1){
            System.out.print("Please enter the long edge = ");
            int longEdge=scan.nextInt();

            System.out.print("Please enter the short edge = ");
            int shortEdge=scan.nextInt();

            int result=(longEdge+shortEdge)*2;
            System.out.println("Circumference of rectangle = "+result);

        }else if(process==2){
            System.out.print("Please enter the long edge = ");
            int longEdge=scan.nextInt();

            System.out.print("Please enter the short edge = ");
            int shortEdge=scan.nextInt();
            
            int result=longEdge*shortEdge;

            System.out.println("Area of rectangle = "+result);

        }else{
            System.out.println("You entered invalid value !");
            return;
        }
    }
}
