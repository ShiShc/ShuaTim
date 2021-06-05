/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 10:54
 * @Auther:ShiShc
 */

//输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        输出: 6
//        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

public class maxSubArray {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];

        for(int i = 1;i < nums.length; ++i) {
            nums[i] += Math.max(nums[i-1], 0);
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
