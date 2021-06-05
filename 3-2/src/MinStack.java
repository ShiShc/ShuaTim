import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/2, 23:31
 * @Auther:ShiShc
 */

public class MinStack {

    Stack<Integer> A,B;

    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
        if(B.isEmpty() || B.peek() >= x) {
            B.push(x);
        }
    }

    public void pop() {
        if(!A.isEmpty() && A.pop().equals(B.peek())) {
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }

    public static void main(String[] args) {

    }
}
