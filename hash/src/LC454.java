import java.util.HashMap;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int temp = 0;
        for(int num1 : nums1) {
            for(int num2 : nums2) {
                if(map.containsKey(num1 + num2)) {
                    temp = map.get(num1 + num2);
                    map.put(num1 + num2, temp + 1);
                } else {
                    map.put(num1 + num2, 1);
                }
            }
        }

        for(int num3 : nums3) {
            for(int num4 : nums4) {
                if(map.containsKey(-(num3 + num4))) {
                    result += map.get(-(num3 + num4));
                }
            }
        }

        return result;
    }
}
