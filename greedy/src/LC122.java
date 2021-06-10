/**
 * @author: ShiShc
 * @desc:
 */
public class LC122 {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int result = 0;

        for(int i = 1;i < prices.length;i ++) {
            int temp;
            if((temp = prices[i] - prices[i-1]) > 0) {
                result += temp;
            }
        }

        return result;
    }
}
