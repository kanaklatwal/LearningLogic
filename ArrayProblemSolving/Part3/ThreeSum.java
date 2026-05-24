package ArrayProblemSolving.Part3;

import java.util.ArrayList;
import java.util.List;
public class ThreeSum {
    public static List <List<Integer>> threeSum(int[] nums, int target){
        List <List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n-2; i++){
           for(int j=i+1; j<n-1;j++){
               for(int k=j+1; k<n; k++){
                   if(nums[i] + nums[j] + nums[k] == target){
                       List<Integer> temp = new ArrayList<>();
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);
                       output.add(temp);

                   }
               }
           }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 6, 2, 9, 3};
        int target = 10;
        List<List<Integer>> ans = threeSum(arr, target);
        for(List<Integer> i : ans){
            System.out.print( i +" ");
        }
    }
}
