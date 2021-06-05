/**
 * @author: ShiShc
 * @desc:
 */
public class LC62 {
    public int uniquePaths(int m, int n) {
        // dp[i][j] biao shi you duo shao zhong lu jing
        int[][] dp = new int[m + 1][n + 1];
        // dp[i][j] = dp[i-1][j] + dp[i][j-1]
        for(int i = 1;i <= m;i ++) {
            for(int j = 1;j <= n;j ++) {
                if(i == 1 && j == 1) {
                    dp[i][j] = 0;
                } else if(i == 1) {
                    dp[i][j] = 1;
                } else if(j == 1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        // chu shi hua
        // bian li
        // jie guo
        return dp[m][n];
    }
}
