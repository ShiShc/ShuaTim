/**
 * @author: ShiShc
 * @desc:
 */
public class LC435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        for(int i = 0;i < intervals.length - 1;i ++) {
            for(int j = 0;j < intervals.length - i - 1;j ++) {
                if(intervals[j][0] > intervals[j + 1][0]) {
                    int temp1 = intervals[j][0];
                    int temp2 = intervals[j][1];
                    intervals[j][0] = intervals[j + 1][0];
                    intervals[j][1] = intervals[j + 1][1];
                    intervals[j + 1][0] = temp1;
                    intervals[j + 1][1] = temp2;
                }
            }
        }

        int result = 1;

        for(int i = 1;i < intervals.length;i ++) {
            if(intervals[i][0] >= intervals[i - 1][1]) {
                result ++;
            } else {
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
            }
        }

        return intervals.length - result;
    }
}
