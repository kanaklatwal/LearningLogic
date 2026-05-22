package ArrayProblemSolving.Part2;

public class RightShiftOfAnArray {
    static void shiftBy1(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        shiftBy1(arr);
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}
