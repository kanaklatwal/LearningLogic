package ArrayProblemSolving.Part2;

import java.util.HashMap;

public class ModeOftheArrray {

    static int getMode(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
//        for(int i: freq.keySet()){
//            //i -> will represent key
//            System.out.println(i + " -> " + freq.get(i));
//        }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyFrequency = freq.get(key);
            if(currentKeyFrequency > maxFreq){
                maxFreq = currentKeyFrequency;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        System.out.println(getMode(arr));
    }
}
