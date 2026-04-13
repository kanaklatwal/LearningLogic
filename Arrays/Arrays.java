package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        //print
        for(int val: arr){
            System.out.println(val);
        }
//        int arr[]; // declaration
//        arr = new int [5];// allocation
//        int brr[] = {1, 2, 3}; // init
//        System.out.println("Value at index 0 " + brr[0]);
//        int n = brr.length;
//        for(int val : brr){
//            System.out.println(val);
//        }
//        for(int i=0; i<= n-1; i++){
//            System.out.println(brr[i]);
//        }

    }
}
