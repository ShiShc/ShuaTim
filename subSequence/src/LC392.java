/**
 * @author: ShiShc
 * @desc:
 */
public class LC392 {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i = 1;i <= len1;i ++) {
            for(int j = 1;j <= len2;j ++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[len1][len2] == len1;
    }
}
