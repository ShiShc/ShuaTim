/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 10:39
 * @Auther:ShiShc
 */

public class maxValue {

    public static int maxValue(int[][] grid) {
        int column = grid[0].length, row = grid.length;

        for(int i = 0;i < row;++ i) {
            for(int j = 0; j < column; ++ j)  {
                if(i == 0 && j == 0) continue;
                if(i == 0) grid[i][j] += grid[i][j-1];
                else if(j == 0) grid[i][j] += grid[i-1][j];
                else grid[i][j] += Math.max(grid[i][j-1], grid[i-1][j]);
            }
        }

        return grid[column-1][row-1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1}, {1,5,1}, {4,2,1}};
        System.out.println(maxValue(grid));
    }
}
