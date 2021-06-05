/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 10:07
 * @Auther:ShiShc
 */

public class maxProfit {

    public static int maxProfit(int[] nums) {
        int min = Integer.MAX_VALUE, max = 0;
        for(int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num - min);
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
