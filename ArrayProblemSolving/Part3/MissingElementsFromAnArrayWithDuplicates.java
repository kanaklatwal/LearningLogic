package ArrayProblemSolving.Part3;

import java.util.ArrayList;
import java.util.List;

public class MissingElementsFromAnArrayWithDuplicates {
    public  static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int index=0; index<n; index++){
            int value = Math.abs(nums[index]);
            int position = value-1;
            if(nums[position]>0){
                nums[position] = -nums[position];
            }
        }
        for(int i=0; i<n; i++) {
            if(nums[i] >0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,4,5,2,2};
        System.out.println(findDisappearedNumbers(arr));
    }
}
