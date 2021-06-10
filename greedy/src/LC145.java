/**
 * @author: ShiShc
 * @desc:
 */
public class LC145 {
    public int conCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0, totalSum = 0, start = 0;
        for(int i = 0;i < gas.length;i ++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if(curSum < 0) {
                start = i + 1;
                curSum = 0;
            }
        }

        if(totalSum < 0) return -1;
        return start;
    }


    public static void main(String[] args) {
        new LC145().conCompleteCircuit(new int[]{1,2,3,4,7}, new int[]{3,4,0,8,1});  }
}
