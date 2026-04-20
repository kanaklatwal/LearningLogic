package Arrays.searching;

public class searchInRotatedArray {
    public static int getPivot(int[] array, int n){
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        while(s<e){
            if(array[mid]>=array[0]){
                s = mid+1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }
    public static int binarySearch(int[] arr,int s, int e, int key){
        int start = s;
        int end = e;
        int mid = start + (end-start)/2;
        while(start<=end){
            if (arr[mid] == key){
                    return mid;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }
            else{ // key<arr[mid]
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
    public static int findPosition(int[] arr, int n, int k){
        int pivot = getPivot(arr,n);
        if(k>= arr[pivot] && k<= arr[n-1]){ // on second line
            return binarySearch(arr, pivot, n-1, k);
        }
        else{ //on first line
            return binarySearch(arr, 0, pivot-1, k);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 1, 2};
        System.out.println(findPosition(arr, 6, 2));
    }
}
