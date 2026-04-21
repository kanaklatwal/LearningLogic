package Arrays.sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};

        selectionSort(arr, arr.length);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
