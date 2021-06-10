import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0;i < nums.length && k > 0;i ++) {
            if(nums[i] >= 0) break;
            if(nums[i] < 0) {
                nums[i] = -nums[i];
                k --;
            }
        }

        if(k % 2 == 1) nums[0] = -nums[0];
        int result = 0;
        for(int i = 0;i < nums.length;i ++) {
            result += nums[i];
        }

        return result;
    }
}
