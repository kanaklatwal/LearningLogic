package Arrays.searching;

import java.sql.SQLOutput;

public class binarySearch {
    public static int biinarySearch(int arr[], int size, int key){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            // right part
            if(key>arr[mid]){
                start = mid+1;
            }
            // left part
            else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8, 12, 18};
        int[] odd = {3, 8, 11, 14, 16};
        int evenIndex = biinarySearch(even, 6, 12);
        System.out.println("index of 12 is : "+ evenIndex);
        int oddIndex = biinarySearch(odd, 5, 8);
        System.out.println("index of 8 is: "+ oddIndex);
    }
}
