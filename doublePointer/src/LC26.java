/**
 * @author: ShiShc
 * @desc:
 */
public class LC26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int frontIndex = 1, behindIndex = 1;
        while(behindIndex < nums.length) {
            if(nums[behindIndex] != nums[behindIndex - 1]) {
                nums[frontIndex] = nums[behindIndex];
                frontIndex ++;
            }
            behindIndex ++;
        }

        return frontIndex;
    }
}
