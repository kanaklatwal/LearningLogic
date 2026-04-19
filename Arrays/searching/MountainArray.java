package Arrays.searching;
//Peak index in a mountain array
// an array arr is called mountain array if:-
//=>arr.length>=3
//=>There exists some i with 0<i<arr.length-1 such that:-
//    # arr[0]<arr[1]<...<arr[i-1]<arr[i]
//    # arr[i]>arr[i+1]>...>arr[arr.length-1]
// Given an integer array arr i.e. guaranteed to be a mountain, return any i such that
//arr[0]<arr[1]<...<arr[i-1]<arr[i]>arr[i+1]>...>arr[arr.length-1]
//Input arr= [0,1,0] Output 1
// Input arr = [0, 2, 1, 0]  Output 1
public class MountainArray{
    public static int peakIndexInMountainArray(int[] arr){
        int s =0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        while(s<e){
            if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        System.out.println("the index of the peak element is : " +peakIndexInMountainArray(arr));
    }
}
