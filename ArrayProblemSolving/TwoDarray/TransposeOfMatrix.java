package ArrayProblemSolving.TwoDarray;

public class TransposeOfMatrix {
    public static int[][] transpose(int[][] matrix){
        if(matrix == null|| matrix.length == 0){
            return new int[0][0];
        }
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalCols];
        for(int row=0; row<totalRows; row++){
            for(int col=0; col<totalCols; col++){
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newArray = transpose(array);
        for(int i=0; i< newArray.length; i++){
            for(int j=0; j< newArray.length; j++){
                System.out.print(newArray[i][j] + " ");
            }
        }

    }
}
