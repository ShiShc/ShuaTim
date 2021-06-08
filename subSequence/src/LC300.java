import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length <= 1) return nums.length;
        // dp[i] = max(dp[i], dp[j] + 1)
        int[] dp = new int[nums.length];
        // chu shi hua        // dp[..] = 1
        Arrays.fill(dp, 1);

        int result = 0;
        for(int i = 1;i < nums.length;i ++) {
            for(int j = 0;j < i;j ++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            result = Math.max(result, dp[i]);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
