import java.util.HashMap;

public class LC930 {
    public int numSubarraysWithSum(int[] nums, int target) {
        int sum = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += num;
            result += map.getOrDefault(sum - target, 0);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC930().numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2));
    }
}
