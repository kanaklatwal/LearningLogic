package ArrayProblemSolving.Part3;

import java.util.HashMap;

public class FindFIrstRepeatingElement {
    public static int findFirstRepeatingElement(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }
        for(int i:nums){
            if(freq.get(i)>1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,7,6,8};
        System.out.println(findFirstRepeatingElement(arr));
    }
}
