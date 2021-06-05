/**
 * @author: ShiShc
 * @desc:
 */
public class LC213 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int money1 = help(nums, 0, nums.length - 2);
        int money2 = help(nums, 1, nums.length - 1);
        return Math.max(money1, money2);
    }

    private int help(int[] nums, int begin, int end) {
        if(begin == end) return nums[begin];
        int[] dp = new int[nums.length];
        dp[begin] = nums[begin];
        dp[begin + 1] = Math.max(nums[begin], nums[begin + 1]);
        for(int i = begin + 2;i <= end;i ++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }

        return dp[end];
    }
}
