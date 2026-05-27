package ArrayProblemSolving.TwoDarray;

public class RotateImageAkaRotateMatrix90 {
    public static void rotate90Clockwise(int[][] matrix, int N){
        // Step1 : Transpose of a matrix
        // swap matrix[i][j], matrix[j][i]
        for(int row=0; row<N; row++){
            for(int col=row+1; col<N; col++){
                // swap matrix[i][j], matrix[j][i]
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        //step2: reverse all rows of matrix
        // har row pr jaunga
        // and use reverse
        for(int row=0; row<N; row++) {
            int startCol = 0;
            int endCol = N - 1;
            while (startCol <= endCol) {
                // swap matrix[row][startCol], matrix[row][endCol]
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;
                startCol++;
                endCol--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6},{7,8,9}};
        int N = array.length;
        rotate90Clockwise(array,N);
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
