package Java_101.classAndObject;

public class car {

        //Nitelikler
        String type="sedan";
        String model;
        String color;
        int speed;
        int speedLimit=180;
        void increaseSpeed(int increment){
            if((speed+increment)< speedLimit){
            speed+=increment;
            }
            
        }

        void decreaseSpeed(int decrease){
            if(speed > 0){
                speed -=decrease;
            }
        }

        void printSpeed(){
            System.out.println(model+ " SPEED : "+speed);

        }

    
}
