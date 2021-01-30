import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 7:12
 * @Auther:ShiShc
 */

public class MaxQueue {

    LinkedList<Integer> A, B;

    public MaxQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public int max_value() {
        if(B.isEmpty()) {
            return -1;
        }
        return B.getLast();
    }

    public void push_back(int value) {
        A.add(value);
        if(B.isEmpty() || B.getLast() <= value) {
            B.add(value);
        }
    }

    public int pop_front() {
        if(A.isEmpty()) {
            return -1;
        }
        int temp = A.getFirst();

        if(A.removeFirst().equals(B.getFirst())) {
            B.removeFirst();
        }

        return temp;
    }

    public static void main(String[] args) {
        MaxQueue obj = new MaxQueue();
        obj.push_back(1);
        obj.push_back(2);
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());

        MaxQueue obj2 = new MaxQueue();
        System.out.println(obj2.pop_front());
        System.out.println(obj2.max_value());
    }



}
