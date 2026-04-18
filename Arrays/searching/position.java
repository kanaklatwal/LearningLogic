package Arrays.searching;
// find first & last position of an element in sorted array
// Problem statement: You have been given a sorted arrayList ARR consisting of 'N' elements. You are also given an integer 'K'
// Task is to find the first and last occurence of 'K' in ARR.
public class position {
    public static int firstOcc(int arr[], int n, int key){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end -start)/2;
        int ans = -1;
        while(start <= end){
            if(arr[mid] == key){
                ans = mid;
                end = mid-1;
            }
            else if(key > arr[mid]){
                start = mid + 1;
            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
            mid = start+ (end - start)/2;
        }
        return ans;
    }
    public static int lastOcc(int arr[], int n , int key){
        int start =0;
        int end = arr.length-1;
        int ans = -1;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(arr[mid]==key){
                ans = mid;
                start = mid + 1;
            }
            else if (key > arr[mid]){
                start = mid + 1;
            }
            else if(key < arr[mid]){
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 6};
        System.out.println("First occurrence of 2 is: " + firstOcc(array, 5, 2));
        System.out.println("Last occurrence of 2 is: "+ lastOcc(array,5, 2));
    }
}
