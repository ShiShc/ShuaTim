import java.util.PriorityQueue;

public class LastStoneWeight {
    public int f(int[] weights) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((x,y) -> (y - x));
        for(int num : weights) {
            heap.offer(num);
        }

        while(heap.size() != 1) {
            int n1 = heap.poll();
            int n2 = heap.poll();
            if(n1 > n2) {
                heap.offer(n1 - n2);
            }
        }

        return heap.poll();
    }

    public static void main(String[] args) {
        System.out.println(new LastStoneWeight().f(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
