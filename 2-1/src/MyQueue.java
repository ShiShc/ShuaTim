import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 19:33
 * @Auther:ShiShc
 */

public class MyQueue {

    Stack<Integer> A,B;

    public MyQueue() {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
    }

    public void push(int x) {
        A.push(x);
    }

    public int pop() {
        if(!B.isEmpty()) return B.pop();
        if(A.isEmpty()) return -1;

        while(!A.isEmpty()) {
            B.push(A.pop());
        }

        return B.pop();
    }

    public int peek() {
        if(!B.isEmpty()) return B.peek();
        if(A.isEmpty()) return -1;

        while(!A.isEmpty()) {
            B.push(A.pop());
        }

        return B.peek();
    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(3);
        obj.push(4);

        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
    }
}
