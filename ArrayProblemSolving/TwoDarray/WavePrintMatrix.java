package ArrayProblemSolving.TwoDarray;

import java.util.ArrayList;
import java.util.List;

public class WavePrintMatrix {
    public static List<Integer> waveMatrixPrint(int[][] matrix, int m , int n){
         List<Integer> result = new ArrayList<>();
         for(int col=0; col<n; col++){
             if(col%2!=0){ //if(col & 1) //odd
                 for(int row = m-1; row>=0; row--){
                     result.add(matrix[row][col]);
                 }
             }
             else{
                 for(int row=0; row<m; row++){
                     result.add(matrix[row][col]);
                 }
             }
         }
         return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(waveMatrixPrint(arr, 4, 4));
    }

}
