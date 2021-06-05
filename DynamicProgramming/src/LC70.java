/**
 * @author: ShiShc
 * @desc:
 */
public class LC70 {
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        // dp[i] bao shi shengyu i jie de shihou you dp[i] zhong fang fa
        int[] dp = new int[n + 1];
        // dp[i] = dp[i-1] + dp[i-2]
        dp[1] = 1;
        dp[2] = 2;
        // dp[1] = 1 dp[2] = 2
        // cong qian wanghou shun xu bian li
        for(int i = 3;i <= n;i ++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        // jie guo

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new LC70().climbStairs(2));
        System.out.println(new LC70().climbStairs(3));
    }
}
