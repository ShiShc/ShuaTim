import java.util.HashMap;
import java.util.Map;

/**
 * @author: ShiShc
 * @date: 2021/7/9
 * @Desc:
 */
public class LC1710 {
    public int majorityElement(int[] nums) {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int bound = nums.length / 2 + 1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() >= bound) {
                result = entry.getKey();
            }
        }

        return result;
    }
}
