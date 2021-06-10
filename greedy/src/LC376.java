/**
 * @author: ShiShc
 * @desc:
 */
public class LC376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1) return nums.length;

        int pre = 0, cur = 0, result = 1;
        for(int i = 0;i < nums.length - 1;i ++) {
            cur = nums[i + 1] - nums[i];
            if((pre <= 0 && cur > 0) || (pre >= 0 && cur < 0)) {
                result ++;
                pre = cur;
            }
        }

        return result;
    }
}
