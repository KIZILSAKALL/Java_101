package Java_101;
import java.util.*;
public class zodiacSign {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
    System.out.print("Please enter the month in which you were born: ");
    String month=scan.next();

    System.out.print("Please enter on what day of "+month+" you were born: ");
    int day=scan.nextInt();

        if(month.equalsIgnoreCase("January")){
            if(day>0 && day<=21){
                System.out.println("Your sign is \"Capricorn Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Aquaris Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("February")){
            if(day>0 && day<=19){
                System.out.println("Your sign is \"Aquaris Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Pisces Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("March")){
            if(day>0 && day<=20){
                System.out.println("Your sign is \"Pisces Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Aries Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("April")){
            if(day>0 && day<=20){
                System.out.println("Your sign is \"Aries Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Taurus Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("May")){
            if(day>0 && day<=21){
                System.out.println("Your sign is \"Taurus Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Gemini Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("June")){
            if(day>0 && day<=22){
                System.out.println("Your sign is \"Gemini Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Cancer Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("July")){
            if(day>0 && day<=22){
                System.out.println("Your sign is \"Cancer Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Leo Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("August")){
            if(day>0 && day<=22){
                System.out.println("Your sign is \"Leo Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Virgo Zodiac Sign\"");
            }

        }else if(month.equalsIgnoreCase("September")){
            if(day>0 && day<=22){
                System.out.println("Your sign is \"Virgo Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Libra Zodiac Sign\"");
            }
            
        }else if(month.equalsIgnoreCase("October")){
            if(day>0 && day<=22){
                System.out.println("Your sign is \"Libra Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Scorpio Zodiac Sign\"");
            }
            
        }else if(month.equalsIgnoreCase("November")){
            if(day>0 && day<=21){
                System.out.println("Your sign is \"Scorpio Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Sagittarius Zodiac Sign\"");
            }
            
        }else if(month.equalsIgnoreCase("December")){
            if(day>0 && day<=21){
                System.out.println("Your sign is \"Sagittarius Zodiac Sign\"");
            }else{
                System.out.println("Your sign is \"Capricorn Zodiac Sign\"");
            }
            
        }
    }
    
}
