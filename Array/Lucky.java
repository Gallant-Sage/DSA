import java.util.List;
import java.util.ArrayList;

public class Lucky {
    public static void main(String[] args) {
        
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        
        for (int row = 0; row < matrix.length; row++) {
            // passing 'row' value in args because we have to find min from value all the cols
            // so the rows will be constant.
            int minCol = minColInRow(matrix, row);

            // we are passing 'minCol' in the args because we have to check if this value is 
            // max of all rows so col will be constant.
            int value = matrix[row][minCol];
            if (checkIfMaxInCol(matrix, minCol, value)) {
                result.add(value);
            }
        }
        
        return result;
    }
    
    // will give the smallest element in every row.
    private int minColInRow(int[][] matrix, int row) {
        int minIndex = 0, min = matrix[row][minIndex];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] < min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }
    
    // will check if the value returned by above function is max in that column or not.
    private boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }
}