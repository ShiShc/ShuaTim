import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1, pos = nums.length - 1;
        int[] result = new int[pos + 1];
        while (left <= right) {
            if(nums[left] * nums[left] < nums[right] * nums[right]) {
                result[pos] = nums[right] * nums[right];
                right --;
            } else {
                result[pos] = nums[left] * nums[left];
                left ++;
            }

            pos --;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC977().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
