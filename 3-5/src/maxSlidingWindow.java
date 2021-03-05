import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 13:42
 * @Auther:ShiShc
 */

public class maxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length == 0 || k == 0) return new int[0];

        Deque<Integer> queue = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        for(int left = 1-k, right = 0; right < nums.length; ++left, ++right) {
            if(left > 0 && queue.peekFirst() == nums[left-1]) {
                queue.removeFirst();
            }
            while(!queue.isEmpty() && queue.peekLast() < nums[right]) {
                queue.removeLast();
            }

            queue.addLast(nums[right]);

            if(left >= 0)
                result[left] = queue.peekFirst();
        }

        return result;

    }

    public static void main(String[] args) {

    }
}
