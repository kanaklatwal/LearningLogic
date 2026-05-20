package ArrayProblemSolving.Part1;

public class ElementsOfArrayMultiplyBy10 {
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int[] newArray = new int[size];
        for(int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr ={3, 4, 5, 6};
        int[] ans = multiplyBy10(arr);
        System.out.println("The new updated array after elements multiply by 10 : " );
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}
