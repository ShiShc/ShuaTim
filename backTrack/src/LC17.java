import java.util.ArrayList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC17 {
    private final String[] dic = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private StringBuilder path = new StringBuilder();
    private List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        backTracking(digits, 0);
        return result;
    }

    private void backTracking(String digits, int index) {
        if(index == digits.length()) {
            result.add(new StringBuilder(path).toString());
            return ;
        }

        int digit = digits.charAt(index) - '0';
        String letters = dic[digit];

        for(int i = 0;i < letters.length();i ++) {
            path.append(letters.charAt(i));
            backTracking(digits, index + 1);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC17().letterCombinations("23"));
    }
}
