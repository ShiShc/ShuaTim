import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/18, 17:11
 * @Auther:ShiShc
 * 1.两数之和
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int target = 9;
        for(int elem:twoSum(a, target)) {
            System.out.println(elem);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int i = 0;i < nums.length; ++i) {
            if(hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
