/**
 * @author: ShiShc
 * @desc:
 */
public class LC377 {
    public int combinationSum4(int[] nums, int target) {
        // ide shihou zu cheng j you dp[i][j]zhong fang fa
        // dp[i][j] =
        int[][] dp = new int[nums.length][target + 1];

        for(int i = 0;i < nums.length;i ++) {
            dp[i][0] = 1;
        }

        for(int i = 0;i < nums.length;i ++) {
            for(int j = nums[i];j <= target;j ++) {
                dp[i][j] = Math.max(dp[i][j], dp[i][j - nums[i]] + 1);
            }
        }

        return dp[nums.length - 1][target];
    }

    public static void main(String[] args) {
        System.out.println(new LC377().combinationSum4(new int[]{1, 2, 3}, 4));
    }
}
