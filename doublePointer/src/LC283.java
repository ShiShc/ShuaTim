/**
 * @author: ShiShc
 * @desc:
 */
public class LC283 {
    public void moveZeros(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return ;
        }

        int left = 0, right = 0;
        while(right < nums.length) {
            if(nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left ++;
            }
            right ++;
        }
    }

    public static void main(String[] args) {
        new LC283().moveZeros(new int[]{0, 1, 0, 3, 12});
    }
}
