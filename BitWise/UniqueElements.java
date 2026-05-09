package BitWise;

public class UniqueElements {
    static int findUnique(int[] arr){
        int ans = 0;
        for(int num : arr){
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr ={2, 2, 5, 8, 9, 5, 7, 8, 9};
        System.out.println("Unique Elements: " + findUnique(arr));
    }
}
