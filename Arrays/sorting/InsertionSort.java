package Arrays.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j= i-1;
            for(; j>=0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 7, 3, 9};
        insertionSort(arr);
        System.out.println("The sorted array is "+ Arrays.toString(arr));
    }
}
