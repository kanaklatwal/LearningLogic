package Arrays.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int s, int e){
        int mid = s+(e-s)/2;
        int len1 = mid - s + 1;
        int len2 = e - mid ;
        int[] first = new int[len1];
        int[] second = new int[len2];

        //copy values
        // k == mainArrayIndex
        int k = s;
        for(int i=0; i<len1; i++){
            first[i] = arr[k++];
        }
        k = mid+1;
        for(int i=0; i<len2; i++){
            second[i] = arr[k++];
        }
        // merge 2 sorted arrays
        int index1 = 0, index2 = 0;
        k = s;

        while(index1 < len1 && index2 < len2){
            if(first[index1] < second[index2]){
                arr[k++] = first[index1++];
            } else {
                arr[k++] = second[index2++];
            }
        }

        // remaining elements
        while(index1 < len1){
            arr[k++] = first[index1++];
        }

        while(index2 < len2){
            arr[k++] = second[index2++];
        }
    }
    public static void mergeSort(int[] arr, int s, int e){

        int mid = s+(e-s)/2;

        // base case
        if(s >= e){
            return;
        }

        // left part sort
        mergeSort(arr, s, mid);

        // right part sort
        mergeSort(arr, mid+1, e);

        // merge
        merge(arr, s, e);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5,1, 6, 9};
        int n = 5;
        mergeSort(arr, 0, n-1);
        System.out.println("the sorted array " + Arrays.toString(arr));
    }

}
