package ArrayProblemSolving.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){ // TimeComplexity   O(n^2)
        for(int i=0; i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,1,3,4};
        selectionSort(arr);
        System.out.println("Printing the sorted array: ");
        for(int value: arr){
            System.out.print(value + "  ");
        }
    }
}
