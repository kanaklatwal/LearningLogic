package ArrayProblemSolving.TwoDarray;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow {
    public static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr.length;
        for(int row=0; row<n; row++){
            int sum=0;
            for(int col=0; col<n; col++){
                int value = arr[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rowSums(arr));
    }
}
