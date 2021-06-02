/**
 * @author: ShiShc
 * @desc:
 */
public class LC474 {
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j] biaoshi you  i ge 0 he j ge 1 de strs zui da ziji de daxiao wei dp[i][j]
        int[][] dp = new int[m + 1][n + 1];

        for(String str : strs) {
            int zeroNum = 0, oneNum = 0;
            for(char c : str.toCharArray()) {
                if(c == '0') zeroNum ++;
                else oneNum ++;
            }

            for(int i = m; i >= zeroNum;i --) {
                for(int j = n;j >= oneNum;j --) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        System.out.println(new LC474().findMaxForm(strs, 5, 3));
    }
}
