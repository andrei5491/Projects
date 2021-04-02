
import java.util.*;


public class BubbleSort {


    public static void main(String[] args) {
        int arr[]= {3,2,7};
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}