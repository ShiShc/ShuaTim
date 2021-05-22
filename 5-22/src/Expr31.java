/**
 * @date: 2021-5-22, 20:42
 * @author: ShiShc
 */
public class Expr31 {
    // 0/1 knapsack
    public int f(int[] values, int[] weights, int maxWeight) {
        // 二维dp定义&初始化
        int[][] dp = new int[values.length][maxWeight + 1];
        for(int j = maxWeight;j >= weights[0];j --) {
            dp[0][j] = dp[0][j - weights[0]] + values[0];
        }

        // dp递推
        for(int i = 1;i < values.length;i ++) {
            for(int j = 1;j < maxWeight + 1;j ++) {
                if (j < weights[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i]] + values[i]);
            }
        }

        return dp[values.length - 1][maxWeight];
    }

    public static void main(String[] args) {
        System.out.println(new Expr31().f(new int[]{20, 30, 65, 40, 60}, new int[]{1, 2, 3, 4, 5}, 10));
    }
}
