import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/22, 10:38
 * @Auther:ShiShc
 */

public class lengthOfLongestSubString {

    public static int help(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int left = -1, result = 0;
//
//        for(int j = 0; j < s.length(); ++j) {
//            if(map.containsKey(s.charAt(j))) {
//                left = Math.max(left, s.charAt(j));
//            }
//            map.put(s.charAt(j), j);
//            result = Math.max(result, j-left);
//        }
//
//        return result;
        HashMap<Character, Integer> dic = new HashMap<>();
        int left = -1, result = 0;

        for(int j = 0; j < s.length(); ++j) {
            if(dic.containsKey(s.charAt(j))) {
                left = j;
                dic.clear();
            }
            dic.put(s.charAt(j), j);
            result = Math.max(result, j - left);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(help("pwwkew"));
    }
}
