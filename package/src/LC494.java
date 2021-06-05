/**
 * @author: ShiShc
 * @desc:
 */
public class LC494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0, result = 0;
        for(int i = 0;i < nums.length;i ++) {
            sum += nums[i];
        }
        if((sum + target) % 2 == 1) return result;
        int half = (sum + target) >> 1;

        int[] dp = new int[half + 1];
        dp[0] = 1;

        for(int i = 0;i < nums.length;i ++) {
            for(int j = half;j >= nums[i];j --) {
                dp[j] += dp[j - nums[i]];
            }
        }

        return dp[half];
    }

    public static void main(String[] args) {
        System.out.println(new LC494().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
