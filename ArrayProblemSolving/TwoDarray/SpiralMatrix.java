package ArrayProblemSolving.TwoDarray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while(startingRow <= endingRow && startingCol <= endingCol){

            // top row
            for(int col = startingCol; col <= endingCol; col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // right column
            for(int row = startingRow; row <= endingRow; row++){
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // bottom row
            if(startingRow <= endingRow){
                for(int col = endingCol; col >= startingCol; col--){
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // left column
            if(startingCol <= endingCol){
                for(int row = endingRow; row >= startingRow; row--){
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(spiralOrder(matrix));
    }
}