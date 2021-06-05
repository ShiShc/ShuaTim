/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 19:01
 * @Auther:ShiShc
 */

public class findNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int columns = matrix.length - 1, rows = matrix[0].length - 1;
        int column = 0, row = rows;

        while(column <= columns && row >= 0) {
            if(matrix[column][row] == target) return true;
            else if(matrix[column][row] > target) row--;
            else column ++;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
