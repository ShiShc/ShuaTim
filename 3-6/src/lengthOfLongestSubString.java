import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/6, 11:01
 * @Auther:ShiShc
 */

public class lengthOfLongestSubString {

    public int lengthOfLongestSubString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = -1, result = 0;

        for(int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right)));

            map.put(s.charAt(right), right);
            result = Math.max(result, right - left);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
