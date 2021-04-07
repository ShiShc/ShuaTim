import java.util.PriorityQueue;

/**
 * @date:2021/4/6, 16:25
 * @author:ShiShc
 */

public class MyTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> (y - x));
        minHeap.add(3);
        minHeap.add(6);
        minHeap.add(4);
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(6);
        maxHeap.add(4);
        maxHeap.add(10);
        maxHeap.add(1);
        maxHeap.add(5);

        System.out.println("----minHeap----");
        System.out.println(minHeap.peek());
        System.out.println(minHeap.size());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.peek());
        System.out.println(minHeap.size());
        System.out.println("----minHeap----");

        System.out.println("----maxHeap----");
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.size());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.size());
        System.out.println("----maxHeap----");
    }
}
