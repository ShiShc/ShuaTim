/**
 * @author: ShiShc
 * @desc:
 */
public class LC494 {
    public int findTargetSumWays(int[] nums, int target) {
        // left - right = target  =>  left - (sum - left) = target => left = (sum + target) / 2
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        int half = sum + target;
        if(half % 2 != 0) {
            return 0;
        }
        half >>= 1;

        // dp[j]  zhuang man j rong ji de bei bao you dp[j]zhong fang fa
        // dp[j] += dp[j - nums[i]]
        int[] dp = new int[half + 1];

        // init : dp[0] = 1
        dp[0] = 1;

        for (int num : nums) {
            for (int j = half; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }

        return dp[half];
    }

    public static void main(String[] args) {
        System.out.println(new LC494().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
