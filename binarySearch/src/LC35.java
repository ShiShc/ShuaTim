/**
 * @author: ShiShc
 * @desc:
 */
public class LC35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, result = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                result = mid;
                return result;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
                result = mid;
            }
        }

        return result + 1;
    }

    public static void main(String[] args) {
        System.out.println(new LC35().searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(new LC35().searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(new LC35().searchInsert(new int[]{1, 3, 5}, 4));
    }
}
