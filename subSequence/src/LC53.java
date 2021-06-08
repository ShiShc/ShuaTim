/**
 * @author: ShiShc
 * @desc:
 */
public class LC53 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return  0;

        int[] dp = new int[nums.length];
        dp[0] = Math.max(nums[0], 0);

        int result = 0;

        for(int i = 1;i < nums.length;i ++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            result = Math.max(result, dp[i]);
        }

        return result;
    }
}
