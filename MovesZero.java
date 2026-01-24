import java.util.*;
public class MovesZero {
    public static void movesZeroToEnd(int[] arr){
        int pos =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr =   new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        movesZeroToEnd(arr);
        System.out.println("Array after moving zeros to end: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
