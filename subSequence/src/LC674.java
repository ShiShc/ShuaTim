import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1) return nums.length;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int result = 0;
        for(int i = 1; i < nums.length;i ++) {
            if(nums[i] > nums[i-1]) dp[i] = dp[i-1] + 1;
            result = Math.max(result, dp[i]);
        }

        return result;
    }
}
