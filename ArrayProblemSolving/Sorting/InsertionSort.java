package ArrayProblemSolving.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int curr = i;
            int prev = i-1;
            int currentValue = arr[i];
            while(prev>=0 && currentValue<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,1,3,4,2};
        insertionSort(arr);
        System.out.println("Printing the array: ");
        for(int value: arr){
            System.out.print(value + " ");
        }
    }
}
