/**
 * @author: ShiShc
 * @desc:
 */
public class LC63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // dp[i][j] biaoshi  xia biao wei i j de shihou you duoshao zhong xuanz e
        // dp[i][j] = dp[i-1][j] + dp[i][j-1]
        // if arr[i][j] == 1    dp[i][j] = 0


        int row = obstacleGrid.length, column = obstacleGrid[0].length;
        int[][] dp = new int[row][column];

        dp[0][0] = 1 - obstacleGrid[0][0];

        for(int i = 1;i < row;i ++) {
            if(obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) dp[i][0] = 1;
        }
        for(int j = 1;j < column;j ++) {
            if(obstacleGrid[0][j] == 0 && dp[0][j-1] == 1) dp[0][j] = 1;
        }

        for(int i = 1;i < row;i ++) {
            for(int j = 1;j < column;j ++) {
                if(obstacleGrid[i][j] == 1) continue;
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[row - 1][column - 1];
    }

    public static void main(String[] args) {
        System.out.println(new LC63().uniquePathsWithObstacles(new int[][]{{1, 0}}));
    }
}
