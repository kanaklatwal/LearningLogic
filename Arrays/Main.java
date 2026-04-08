package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = {12, 52, 45, 87, 96};
        int[] arr1; // declaration of array. arr1 is getting defined in the stack
        arr1 = new int[8]; // initialisation: actually here object is being created in the memory (heap)
        String[] arrr = new String[4];
        System.out.println(arrr[0]);//null
    }
}
