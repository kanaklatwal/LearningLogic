package ArrayProblemSolving.Part3;

public class TwoSum {
    public static int[] getTwoSum(int[] nums, int target){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    int ans[] = {i, j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {2,7,4,3,6};
        int target = 10;
        int[] ans = getTwoSum(arr, target);
        for(int i : ans){
            System.out.print( i +" ");
        }
    }
}
