import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for(int pos = 0; pos < nums.length - 2; pos ++) {
            if(nums[pos] > 0) {
                return lists;
            }
            if(pos > 0 && nums[pos] == nums[pos - 1]) {
                continue;
            }
            for(int left = pos + 1, right = nums.length - 1; left < right;) {
//                while(left < right && nums[right] == nums[right - 1]) right --;
//                while(left < right && nums[left] == nums[left + 1]) left ++;

                if(nums[left] + nums[right] + nums[pos] == 0) {
                    lists.add(Arrays.asList(nums[left], nums[right], nums[pos]));
                    while(left < right && nums[right] == nums[right - 1]) right --;
                    while(left < right && nums[left] == nums[left + 1]) left ++;
                    right --;
                    left ++;
                } else if(nums[left] + nums[right] + nums[pos] > 0) {
                    right --;
                } else {
                    left ++;
                }
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new LC15().threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
        System.out.println(lists.toString());
    }
}
