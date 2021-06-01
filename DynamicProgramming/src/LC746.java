/**
 * @author: ShiShc
 * @desc:
 */
public class LC746 {
    public int minCostClibingStairs(int[] costs) {
        // dp[i] biaoshi di i jie hua fei de zui xiao ti li dp[i]
        int[] dp = new int[costs.length + 2];
        // dp[i] = min(dp[i-1], dp[i-2]) + cost[i]
        // dp[1] = cost[0] dp[2] = cost[1]
        dp[1] = costs[0];
        dp[2] = costs[1];
        // shun xu bian li
        for(int i = 3;i < costs.length + 1;i ++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + costs[i - 1];
        }
        dp[costs.length + 1] = Math.min(dp[costs.length], dp[costs.length - 1]);
        // fan hui jie guo

        return dp[costs.length + 1];
    }
}
