import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/2, 23:13
 * @Auther:ShiShc
 */

public class CQueue {

    Stack<Integer> A,B;

    public CQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void appendTail(int value) {
        A.push(value);
    }

    public int deleteHead() {
        if(A.isEmpty()) return -1;

        while(!A.isEmpty()) {
            B.push(A.pop());
        }

        int result = B.pop();

        while(!B.isEmpty()) {
            A.push(B.pop());
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
