package ArrayProblemSolving.TwoDarray;

import java.util.ArrayList;
import java.util.List;

public class SumOFEachColumn {
    public static List<Integer> columnSums(int[][] matrix){
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int col=0; col<n; col++){
            int sum=0;
            for(int row=0; row<m; row++){
                int value = matrix[col][row];
                sum =sum+value;
            }
            result.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(columnSums(arr));
    }
}
