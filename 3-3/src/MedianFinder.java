import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/3, 21:15
 * @Auther:ShiShc
 */

public class MedianFinder {

    Queue<Integer> A, B;

    public MedianFinder() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((x,y) -> (y-x));
    }

    public void addNum(int num) {
        if(A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }

    public static void main(String[] args) {
        MedianFinder finder = new MedianFinder();
        finder.addNum(2);
        System.out.println(finder.findMedian());
        finder.addNum(3);
        System.out.println(finder.findMedian());
    }

//    ArrayList<Integer> A;
//
//    public MedianFinder() {
//        A = new ArrayList<>();
//    }
//
//    public void addNum(int num) {
//        A.add(num);
//    }
//
//    public double findMedian() {
//        if(A == null || A.size() == 0) return -1;
//
//        Object[] array = A.toArray();
//        Arrays.sort(array);
//
//        return array.length % 2 == 0 ? ((Integer)array[array.length/2] + (Integer) array[array.length/2 - 1])/2.0 : (Integer)array[array.length/2]/1.0;
//    }
//
//    public static void main(String[] args) {
//        MedianFinder finder = new MedianFinder();
//        finder.addNum(2);
//        System.out.println(finder.findMedian());
//        finder.addNum(3);
//        System.out.println(finder.findMedian());
//    }
}
