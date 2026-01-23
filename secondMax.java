import java.util.Scanner;
public class secondMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr =   new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("the maximum element in the array is: "+ max);
        for(int i=0; i<n; i++){
            if(arr[i]>secondMax && arr[i]!= max){
                secondMax = arr[i];
            }
        }
        System.out.println("the second maximum element in the array is: "+ secondMax);
        sc.close();
    }
}
