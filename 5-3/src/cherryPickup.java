/**
 * @date: 2021-5-3, 11:01
 * @author: ShiShc
 * 一个N x N的网格(grid)代表了一块樱桃地，每个格子由以下三种数字的一种来表示：
 *
 * 0 表示这个格子是空的，所以你可以穿过它。
 * 1 表示这个格子里装着一个樱桃，你可以摘到樱桃然后穿过它。
 * -1 表示这个格子里有荆棘，挡着你的路。
 * 你的任务是在遵守下列规则的情况下，尽可能的摘到最多樱桃：
 *
 * 从位置(0, 0) 出发，最后到达 (N-1, N-1) ，只能向下或向右走，并且只能穿越有效的格子（即只可以穿过值为0或者1的格子）；
 * 当到达 (N-1, N-1) 后，你要继续走，直到返回到 (0, 0) ，只能向上或向左走，并且只能穿越有效的格子；
 * 当你经过一个格子且这个格子包含一个樱桃时，你将摘到樱桃并且这个格子会变成空的（值变为0）；
 * 如果在 (0, 0) 和 (N-1, N-1) 之间不存在一条可经过的路径，则没有任何一个樱桃能被摘到。

 */

public class cherryPickup {

    public int f(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for(int i = 0;i < grid.length;i ++) {
            for(int j = 0;j < grid[0].length; j ++) {
                if(i == 0 && j == 0) {
                    continue;
                }
                if(i == 0) {
                    dp[i][j] = (grid[i][j] == -1) ? 0 : dp[i][j-1] + grid[i][j];
                    continue;
                }
                if(j == 0) {
                    dp[i][j] = (grid[i][j] == -1) ? 0 : dp[i-1][j] + grid[i][j];
                    continue;
                }
                dp[i][j] = (grid[i][j] == -1) ? 0 : Math.max(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        // 出现了不存在路径的情况，需要处理 Exception:数组越界
        for(int i = grid.length - 1, j = grid[0].length - 1;;) {
            grid[i][j] = 0;
            if(dp[i-1][j] == dp[i][j] - 1) {
                i = i-1;
            } else {
                j = j-1;
            }
            if(i == 0 && j == 0) {
                break;
            }
        }
        int[][] dp2 = new int[grid.length][grid[0].length];
        for(int i = grid.length - 1;i >= 0;i --) {
            for(int j = grid[0].length - 1;j >= 0; j--) {
                if(i == grid.length - 1 && j == grid[0].length - 1) {
                    continue;
                }
                if(i == grid.length - 1) {
                    dp2[i][j] = (grid[i][j] == -1) ? 0 : dp2[i][j+1] + grid[i][j];
                    continue;
                }
                if(j == grid[0].length - 1) {
                    dp2[i][j] = (grid[i][j] == -1) ? 0 : dp2[i+1][j] + grid[i][j];
                    continue;
                }
                dp2[i][j] = (grid[i][j] == -1) ? 0 : Math.max(dp2[i+1][j], dp2[i][j+1]) + grid[i][j];
            }
        }


        return dp[grid.length - 1][grid[0].length - 1] + dp2[0][0];
    }

    public static void main(String[] args) {
//        [[1,1,-1],[1,-1,1],[-1,1,1]]
        int[][] grid = {{1, 1, -1}, {1, -1, 1}, {-1, 1, 1}};
        System.out.println(new cherryPickup().f(grid));
    }
}
