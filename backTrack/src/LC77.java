import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC77 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> path = new LinkedList<>();
        backTracking(n, k, 1, path);
        return result;
    }

    private void backTracking(int n, int k, int startIndex, LinkedList<Integer> path) {
        if(k == path.size()) {
            result.add(new LinkedList<>(path));
            return;
        }
        for(int i = startIndex;i <= n;i ++) {
            path.add(i);
            backTracking(n, k, i + 1, path);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC77().combine(4, 2));
    }
}
