/**
 * @author: ShiShc
 * @desc:
 */
public class LC45 {
    public int jump(int[] nums) {
        if(nums.length <= 1) return 0;
        int result = 0;
        int curMaxStep = 0, nextMaxStep = 0;

        for(int i = 0;i < nums.length;i ++) {
            nextMaxStep = Math.max(nextMaxStep, i + nums[i]);
            if(i == curMaxStep) {
                if(curMaxStep != nums.length - 1) {
                    result ++;
                    curMaxStep = nextMaxStep;
                    if(nextMaxStep >= nums.length - 1) break;
                } else {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new LC45().jump(new int[] {2,3,1,1,4});
    }
}
