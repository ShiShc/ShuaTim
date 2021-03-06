/**
 * @author: ShiShc
 * @desc:
 */
public class LC714 {
    public int maxProfit(int[] prices, int fee) {
        int result = 0;
        int minPrice = prices[0];

        for(int i = 1;i < prices.length;i ++) {
            if(prices[i] < minPrice) minPrice = prices[i];

            if(prices[i] >= minPrice && prices[i] <= minPrice + fee) {
                continue;
            }

            if(prices[i] > minPrice + fee) {
                result += prices[i] - minPrice - fee;
                minPrice = prices[i] - fee;
            }
        }

        return result;
    }
}
