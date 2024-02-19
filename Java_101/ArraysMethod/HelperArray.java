package Java_101.ArraysMethod;

public class HelperArray {
    static void print(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }


    static int[] fill(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value;
            
        }
        return arr;
    }
}
