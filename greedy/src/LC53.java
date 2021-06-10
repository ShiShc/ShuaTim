/**
 * @author: ShiShc
 * @desc:
 */
public class LC53 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count = 0;

        for(int num : nums) {
            count += num;
            result = Math.max(result, count);
            if(count < 0) count = 0;
        }

        return result;
    }
}
