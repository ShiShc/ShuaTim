import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 20:22
 * @Auther:ShiShc
 */

public class calPoints {

    public static int calPoints(String[] ops) {
        int length = ops.length;
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0;i < length; ++i) {
            if(ops[i].equals("C")) {
                stack.pop();
            } else if(ops[i].equals("D")) {
                stack.push(stack.peek() * 2);
            } else if(ops[i].equals("+")) {
                int last = stack.pop();
                int temp = stack.peek();
                stack.push(last);
                stack.push(temp + last);
            } else {
                stack.push(Integer.parseInt(ops[i]));
            }
        }

        for(int i:stack) {
            result += i;
        }

        return result;

    }

    public static void main(String[] args) {
        String[] ops1 = {"5","2","C","D","+"};
        String[] ops2 = {"5","-2","4","C","D","9","+","+"};

        System.out.println(calPoints(ops1));
        System.out.println(calPoints(ops2));
    }

}
