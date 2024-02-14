package Java_101;

public class isPolindrome {
    public static void main(String[] args){
        isPolindrome(222);

    }
        
    
    public static boolean isPolindrome(int number){
        int temp= number, reverseNumber=0;
        int lastNumber;

        while(temp !=0){
            System.out.println("****************");
            System.out.println("Sayı => "+temp);
          lastNumber = temp % 10;
          System.out.println("Son basamak => "+lastNumber);
          reverseNumber=(reverseNumber*10)+lastNumber;
          System.out.println("Yeni sayı => "+reverseNumber);
          temp /=10;

        }
        if(reverseNumber==number){
            System.out.println("Yes "+number+" is a polindrome number.");
            return true;
        }else{
            System.out.println("No "+number+" is not a polindrome number.");
            return false;
        }
    }
   
    
   

}
