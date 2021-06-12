import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC216 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1, 0);
        return result;
    }

    private void backTracking(int k, int n, int startIndex, int sum) {
        if(path.size() == k) {
            if(sum == n) {
                result.add(new LinkedList<>(path));
            }

            return;
        }

        for(int i = startIndex;i <= 9; i ++) {
            path.add(i);
            backTracking(k, n, i + 1, sum + i);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC216().combinationSum3(3, 7));
        System.out.println(new LC216().combinationSum3(3, 9));
    }
}
