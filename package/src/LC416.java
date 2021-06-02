/**
 * @author: ShiShc
 * @desc:
 */
public class LC416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i ++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) return false;
        sum >>= 1;

        int[] dp = new int[sum + 1];
        dp[0] = 0;

        for(int i = 1;i < nums.length;i ++) {
            for(int j = sum;j >= nums[i];j --) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }

        return dp[sum] == sum;
//        int[][] dp = new int[nums.length][sum + 1];
//        for(int j = sum;j >= nums[0];j --) {
//            dp[0][j] = dp[0][j-nums[0]] + nums[0];
//        }
//        // dp[i][j] = max(dp[i-1][j], dp[i-1][j-nums[i]] + nums[i])
//        for(int i = 1;i < nums.length;i ++) {
//            for(int j = 0;j <= sum;j ++) {
//                if(j < nums[i]) dp[i][j] = dp[i-1][j];
//                else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i]] + nums[i]);
//            }
//        }
//        return dp[nums.length - 1][sum] == sum;
    }

    public static void main(String[] args) {
        //System.out.println(new LC416().canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(new LC416().canPartition(new int[]{1, 2, 3, 5}));
        System.out.println(new LC416().canPartition(new int[]{2, 2, 4, 10}));
        System.out.println(new LC416().canPartition(new int[]{2, 2, 4, 8}));
    }
}
