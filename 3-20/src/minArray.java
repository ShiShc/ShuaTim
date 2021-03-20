/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 16:03
 * @Auther:ShiShc
 */

public class minArray {

    public static int minArray(int[] nums) {
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]) {
                right = mid;
            } else if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right -= 1;
            }
        }

        return nums[left];

    }

    public static void main(String[] args) {

    }
}
