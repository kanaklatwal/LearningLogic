package BinarySearch;

public class BinarySearchImplementation {
    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;

        while(start<=end){
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int target = 70;
        System.out.println(binarySearch(arr, target));
    }
}
