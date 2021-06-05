/**
 * @author: ShiShc
 * @desc:
 */
public class LC343 {
    public int integerBreak(int n) {
        // dp[i] biao shi chai fen i de zui da cheng ji
        int[] dp = new int[n + 1];
        // dp[i] = dp[i-1] + 2 * i - n - 1
        dp[2] = 1;
        // dp[2] = 1 dp[3] = 2
        for(int i = 3;i <= n;i ++) {
            for(int j = 1;j < i;j ++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j) * j));
            }
        }

        return dp[n];
        // return dp[n]
    }
}
