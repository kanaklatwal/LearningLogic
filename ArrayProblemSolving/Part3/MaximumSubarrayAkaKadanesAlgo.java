package ArrayProblemSolving.Part3;

public class MaximumSubarrayAkaKadanesAlgo {
    public static int maxSubarray(int[] nums){
        int sum=0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubarray(arr));
    }
}
