package ArrayProblemSolving.Part2;

public class FindMissingNumber {
    public static int missingNumber(int[] nums){
        int xorSum = 0;
        for(int n: nums){
            xorSum = xorSum ^ n;
        }
        for(int i =0; i<=nums.length; i++){
            xorSum = xorSum^i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,0};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
