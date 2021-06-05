/**
 * @date: 2021-5-3, 10:31
 * @author: ShiShc
 *
 * 汽车从起点出发驶向目的地，该目的地位于出发位置东面 target英里处。
 *
 * 沿途有加油站，每个station[i]代表一个加油站，它位于出发位置东面station[i][0]英里处，并且有station[i][1]升汽油。
 *
 * 假设汽车油箱的容量是无限的，其中最初有startFuel升燃料。它每行驶 1 英里就会用掉 1 升汽油。
 *
 * 当汽车到达加油站时，它可能停下来加油，将所有汽油从加油站转移到汽车中。
 *
 * 为了到达目的地，汽车所必要的最低加油次数是多少？如果无法到达目的地，则返回 -1 。
 *
 * 注意：如果汽车到达加油站时剩余燃料为 0，它仍然可以在那里加油。如果汽车到达目的地时剩余燃料为 0，仍然认为它已经到达目的地。
 */

public class minRefuelStops {
    public int f(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        long[] dp = new long[n + 1];
        dp[0] = startFuel;
        for(int i = 0; i < n;i ++) {
            for(int t = i; t >= 0; t--) {
                if(dp[t] >= stations[i][0]) {
                    dp[t+1] = Math.max(dp[t+1], dp[t] + stations[i][1]);
                }
            }
        }

        for(int i = 0; i <= n;i ++) {
            if(dp[i] >= target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new minRefuelStops().f(1, 1, new int[][]{}));
    }
}
