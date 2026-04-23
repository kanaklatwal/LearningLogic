package Arrays.sorting;
import java.util.Arrays;
public class BubbleSort {
    public static <bool> void bubbleSort(int[] arr){
        int n = arr.length;
       for(int i=1; i<n; i++){
           boolean swapped = false;
           for(int j=0; j<n-i; j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swapped = true;
               }
           }
           if(swapped == false){
               break;
           }
       }
    }

    public static void main(String[] args) {
        int[] arr = {4, 78, 90, 32, 54, 12};
        bubbleSort(arr);
        System.out.println("Sorted Array "+ Arrays.toString(arr));
    }
}
