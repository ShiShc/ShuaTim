import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC40 {

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        Arrays.sort(candidates);
        backTracking(candidates, target, 0, 0, used);
        return result;
    }

    private void backTracking(int[] candidates, int target, int sum , int startIndex, boolean[] used) {
        if(sum > target) {
            return ;
        }
        if(sum == target) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i < candidates.length;i ++) {
            if(i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            used[i] = true;
            backTracking(candidates, target, sum + candidates[i], i + 1, used);
            used[i] = false;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC40().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
    }
}
