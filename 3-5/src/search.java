/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 18:16
 * @Auther:ShiShc
 */

public class search {

    public static int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target-1);
    }

    private static int helper(int[] nums, int target){
        int left = 0, right = nums.length - 1;

        while(left < right) {
            int mid = (left + right) / 2;
            if(nums[mid] <= target) left = mid+1;
            else right = mid-1;
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}
