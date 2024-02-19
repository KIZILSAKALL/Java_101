package Java_101.ArraysMethod;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list={1,2,3,4,5,6,7};
       // System.out.println(Arrays.toString(list)); 
       list=HelperArray.fill(list, 6);

       HelperArray.print(list);

      //  Arrays.fill(list, 10);
       // System.out.println(Arrays.toString(list)); 


        double [] list2={5,6.57,78,2,13,1};

    }

}
