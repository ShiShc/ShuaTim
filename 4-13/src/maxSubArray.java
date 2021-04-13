/**
 * @date:2021-4-13, 16:14
 * @author:ShiShc
 */

public class maxSubArray {
    public int f(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int sum = nums[0];
        for(int i = 1;i < nums.length; ++i) {
            nums[i] += Math.max(nums[i - 1], 0);
            sum = Math.max(sum, nums[i]);

        }

        return sum;
    }
}
