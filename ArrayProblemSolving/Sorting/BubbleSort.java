package ArrayProblemSolving.Sorting;

public class BubbleSort {
    public static void getBubbleSort(int[] arr){  // Time complexity :-  O(n^2)
        for(int i=0; i<arr.length-1; i++){ // Rounds
            for(int j=0; j<arr.length-i-1; j++){  // neighbouring element comparison
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,1,3};
        getBubbleSort(arr);
        System.out.println("Printing the array: ");
        for(int value: arr){
            System.out.print(value + " ");
        }
    }
}
