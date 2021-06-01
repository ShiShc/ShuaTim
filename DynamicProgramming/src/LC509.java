/**
 * @author: ShiShc
 * @desc:
 */
public class LC509 {
    public int fib(int n) {
        // dp[i]  xia biao wei i de feibonaqi zhi shi dp[i]
        int[] dp = new int[n + 1];
        // dp[i] = dp[i-1] + dp[i-2]
        dp[0] = 0;
        dp[1] = 1;
        // dp[0] = 0, dp[1] = 1
        // cong qian wang hou bian li
        for(int i = 2;i <= n;i ++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        // juli

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new LC509().fib(2));
        System.out.println(new LC509().fib(3));
        System.out.println(new LC509().fib(4));
    }
}
