package ArrayProblemSolving.Part3;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,2,3,3,3,3,3,4,4,4,5,5};
        System.out.println(removeDuplicates(arr));
    }
}
