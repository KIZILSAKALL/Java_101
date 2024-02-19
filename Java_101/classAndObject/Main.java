package Java_101.classAndObject;

public class Main {
     public static void main(String[] args) {
        Car audi= new Car();
        audi.model="Audi A3";
        audi.speed=10;
        audi.increaseSpeed(20);
        audi.printSpeed();

        Car bmw=new Car();
        bmw.model="BMW İ8";
        bmw.speed=20;
        bmw.decreaseSpeed(12);
        bmw.printSpeed();


        Car mercedes=new Car();
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
