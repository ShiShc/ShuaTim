/**
 * @author: ShiShc
 * @desc:
 */
public class LC452 {
    public int findMinArrowShots(int[][] points) {
        for(int i = 0;i < points.length - 1;i ++) {
            for(int j = 0;j < points.length - i - 1;j ++) {
                if(points[j][0] > points[j + 1][0]) {
                    int temp1 = points[j][0];
                    int temp2 = points[j][1];
                    points[j][0] = points[j + 1][0];
                    points[j][1] = points[j + 1][1];
                    points[j + 1][0] = temp1;
                    points[j + 1][1] = temp2;
                }
            }
        }

        int result = 1;
        for(int i = 1;i < points.length;i ++) {
            if(points[i][0] > points[i - 1][1]) {
                result ++;
            } else {
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new LC452().findMinArrowShots(new int[][] {
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12},
        });
    }
}
