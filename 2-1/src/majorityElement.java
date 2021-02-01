import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 15:39
 * @Auther:ShiShc
 */

public class majorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(nums));
    }
}
