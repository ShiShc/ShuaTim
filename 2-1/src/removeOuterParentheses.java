/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 18:09
 * @Auther:ShiShc
 */

public class removeOuterParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int match = 0;

        for(char c : s.toCharArray()) {
            if(c == ')') --match;
            if(match >= 1) result.append(c);
            if(c == '(') ++match;
        }

        return result.toString();
    }

    public static String removeOuterParentheses2(String s) {
        char[] result = new char[s.length()];
        int pos = 0;
        int match = 0;

        for(char c : s.toCharArray()) {
            if(c == ')') --match;
            if(match >= 1) result[pos++] = c;
            if(c == '(') ++match;
        }

        return String.valueOf(result,0,pos);
    }


    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses2("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses2("(()())(())(()(()))"));
    }
}
