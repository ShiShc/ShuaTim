import java.util.*;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> dic = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1) {
            dic.add(num);
        }
        for(int num : nums2) {
            if(dic.contains(num)) {
                dic.remove(num);
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC349().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}
