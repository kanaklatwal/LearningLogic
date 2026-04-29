package Arrays.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int s, int e){
         int pivot = arr[s];
         int cnt = 0;
         for(int i = s+1; i<=e; i++){
             if(arr[i] <= pivot){
                 cnt++;
             }
         }

         // place pivot at right position
         int pivotIndex = s + cnt;
         swap(arr, pivotIndex, s);

         //left and right wala part'
         int i = s, j = e;
         while(i < pivotIndex && j > pivotIndex){
             while(arr[i] < pivot){
                 i++;
             }
             while(arr[j] > pivot){
                 j--;
             }
             if(i < pivotIndex && j > pivotIndex){
                 swap(arr, i++, j--);
             }
         }
         return pivotIndex;
    }

    public static void quickSort(int arr[], int s, int e){
        // base case
        if(s >= e){
            return;
        }

        //partition
        int p = partition(arr, s, e);
        quickSort(arr, s, p-1);// left part sorted
        quickSort(arr, p+1, e);
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 9};
        quickSort(arr, 0, 4);
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }
}
