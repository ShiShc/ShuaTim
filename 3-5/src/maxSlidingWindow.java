import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 13:42
 * @Auther:ShiShc
 */

public class maxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];

        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for(int j = 0, i = 1 - k;j < nums.length; ++i, ++j) {
            if(i > 0 && deque.peekFirst() == nums[i-1]) {
                deque.removeFirst();
            }
            while(!deque.isEmpty() && deque.peekFirst() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);

            if(i >= 0) {
                result[i] = deque.peekFirst();
            }
        }


        return result;
    }

    public static void main(String[] args) {

    }
}
