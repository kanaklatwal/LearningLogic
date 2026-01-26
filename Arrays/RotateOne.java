package Arrays;

import java.util.*;

class RotateOne{
    public static int[] rotateArray1Place(int[] nums){
         int temp = nums[0];
         for(int i=1; i<nums.length; i++){
            nums[i-1]=nums[i];
         }
         nums[nums.length-1] =  temp;
         return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr =   new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] hey =  rotateArray1Place(arr);
        System.out.println(" the rotated array is: " );
        for(int i =0 ; i<hey.length;i++){
            System.out.print(hey[i] +" ");
        }
        sc.close();
    }
}