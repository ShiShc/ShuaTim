/**
 * @date:2021/4/6, 18:36
 * @author:ShiShc
 */

public class Test03 {
    public static int f(int[] nums) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i < nums.length; ++i) {
            min = Math.min(min, nums[i]);
            result = Math.max(nums[i] - min, result);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1,3,7,2,6,9,4}));
        System.out.println(f(new int[]{4,3,9,1,4,8,2}));
    }
}
