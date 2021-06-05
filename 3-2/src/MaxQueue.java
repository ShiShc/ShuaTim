import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/2, 23:43
 * @Auther:ShiShc
 */

public class MaxQueue {

    LinkedList<Integer> A,B;

    public MaxQueue() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public int max_value() {
        return B.isEmpty()?-1:B.peekFirst();
    }

    public void push_back(int value) {
        A.addLast(value);
//        if(B.isEmpty() || B.getLast() > value) {
//            B.addLast(value);
//        }
        while(!B.isEmpty() && B.peekLast() < value)
            B.pollLast();
        B.addLast(value);
    }

    public int pop_front() {
        if(A.isEmpty()) return -1;

        if(A.peekFirst().equals(B.peekFirst()))
            B.pollFirst();

        return A.pollFirst();
    }


    public static void main(String[] args) {

    }
}
