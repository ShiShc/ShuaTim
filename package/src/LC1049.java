/**
 * @author: ShiShc
 * @desc:
 */
public class LC1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for(int i = 0;i < stones.length;i ++) {
            sum += stones[i];
        }
        int half = sum >> 1;
        int[] dp = new int[half + 1];

        for (int stone : stones) {
            for (int j = half; j >= stone; j--) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }

        return (sum - dp[half]) - dp[half];
    }
}
