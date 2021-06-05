/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 23:54
 * @Auther:ShiShc
 */


/**
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class maxProfit {
    public static int maxProfit (int[] nums) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0;i < nums.length; ++i) {
            if(nums[i] < min) min = nums[i];
            profit = Math.max(profit, nums[i] - min);
        }

        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
