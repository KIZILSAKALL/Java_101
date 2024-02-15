package Java_101.classAndObject;

public class main {
     public static void main(String[] args) {
        car audi= new car();
        audi.model="Audi A3";
        audi.speed=10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        car bmw=new car();
        bmw.model="BMW İ8";
        bmw.speed=20;
        bmw.decreaseSpeed(12);
        bmw.printSpeed();


        car mercedes=new car();
        mercedes.model="Mercedes E250";
        mercedes.speed=40;
        mercedes.printSpeed();


        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
     }
    
}
