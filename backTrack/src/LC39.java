import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC39 {

    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, 0);
        return result;
    }

    private void backTracking(int[] candidates, int target, int sum, int startIndex) {
        if(sum > target) {
            return ;
        }
        if(sum == target) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i < candidates.length;i ++) {
            path.add(candidates[i]);
            backTracking(candidates, target, sum + candidates[i], i);
            path.removeLast();
        }
    }
}
