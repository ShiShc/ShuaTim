import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/19, 0:02
 * @Auther:ShiShc
 * 3. 无重复字符的最长子串
 */

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcdcda";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = s.length();
        int rp = -1, ans = 0;

        for(int i = 0;i < len; ++ i) {
            if(i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while(rp + 1 < len && !set.contains(s.charAt(rp+1))) {
                set.add(s.charAt(rp + 1));
                ++ rp;
            }
            ans = Math.max(ans, rp-i+1);
        }
        return ans;
    }

}
