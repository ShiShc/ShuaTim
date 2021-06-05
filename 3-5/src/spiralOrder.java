/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 18:33
 * @Auther:ShiShc
 */

public class spiralOrder {

    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];

        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int sum = 0;

        int[] result = new int[(right + 1) * (bottom + 1)];
        while(true) {
            for(int i = left; i <= right; ++ i) result[sum++] = matrix[top][i];
            if(++top > bottom) break;
            for(int i = top; i <= bottom; ++i) result[sum++] = matrix[i][right];
            if(left > --right) break;
            for(int i = right; i >= left; --i) result[sum++] = matrix[bottom][i];
            if(top > --bottom) break;
            for(int i = bottom; i >= top; --i) result[sum++] = matrix[i][left];
            if(++left > right) break;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
