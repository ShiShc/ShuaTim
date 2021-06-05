import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 20:00
 * @Auther:ShiShc
 */

public class removeDuplicates {

    public static String removeDuplicates(String S) {
        if(S == null || S.length() == 0) return S;

        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i < S.length(); ++i) {
            if(stack.isEmpty() || stack.peek() != S.charAt(i)) {
                stack.push(S.charAt(i));
            } else {
                stack.pop();
            }
        }

        /**
         * 在打印栈成字符串这里纠结了一下，好像没有更好的方法
         */
        char[] result = new char[stack.size()];
        int pos = 0;
        for(char c:stack) {
            result[pos++] = c;
        }

        return String.valueOf(result);
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
}
