/**
 * @date:2021/4/7, 23:56
 * @author:ShiShc
 */

public class isMatch {
    public static boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();

        boolean[][] dp = new boolean[slen + 1][plen + 1];
        dp[0][0] = true;
        for(int i = 1;i <= slen; i++) {
            for(int j = 1;j <= plen; j++) {
                if(p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i][j-2];
                    if(match(s, p, i-1 ,j)) {
                        dp[i][j] = dp[i][j-1];
                    }
                } else {
                    dp[i][j] = dp[i-1][j-1] && match(s, p, i-1, j-1);
                }
            }
        }

        return dp[slen][plen];
    }

    private static boolean match(String s, String p, int i, int j) {
        if(i == 0) {
            return false;
        }
        if(p.charAt(j) == '.') {
            return true;
        }
        return s.charAt(i) == p.charAt(j);
    }

    public static void main(String[] args) {

    }
}
