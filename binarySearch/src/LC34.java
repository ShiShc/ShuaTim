import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC34 {
//    public int[] searchRange(int[] nums, int target) {
//        int left = 0, right = nums.length - 1, result = -1;
//        while(left <= right) {
//            int mid = (left + right) / 2;
//            if(nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//                result = mid;
//            }
//        }
//
//        int resultRight = result;
//        for(int i = result;i <= nums.length - 1;i ++) {
//            if(nums[i] == target) resultRight ++;
//        }
//
//        return new int[]{result + 1, resultRight};
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new LC34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
//        System.out.println(Arrays.toString(new LC34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
//        System.out.println(Arrays.toString(new LC34().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
//    }
}
