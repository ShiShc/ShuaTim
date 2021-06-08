/**
 * @author: ShiShc
 * @desc:
 */
public class LC474 {
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j] zui duo you i ge 0 he j ge yi de zui da zi ji da xiao wei dp[i][j]
        int[][] dp = new int[m + 1][n + 1];
        for(String str : strs) {
            int zeroNum = 0, oneNum = 0;
            for(char c : str.toCharArray()) {
                if(c == '0') zeroNum ++;
                else oneNum ++;
            }

            // dp[i][j] = dp[i - zeroNum][j - oneNum] + 1
            for(int i = m;i >= zeroNum;i --) {
                for(int j = n;j >= oneNum;j --) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }

        return dp[m][n];
    }
}
