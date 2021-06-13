import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC131 {

    private List<List<String>> result = new ArrayList<>();
    private LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return result;
    }

    private void backTracking(String s, int startIndex) {
        if(startIndex >= s.length()) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i < s.length();i ++) {
            if(isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                path.add(str);
            } else {
                continue;
            }

            backTracking(s, i + 1);
            path.removeLast();
        }
    }

    private boolean isPalindrome(String s, int startIndex, int end) {
        for(int left = startIndex, right = end; left < right;left ++, right--) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }

        return true;
    }
}
