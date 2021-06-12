import java.util.ArrayList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC56 {
    public int[][] merge(int[][] intervals) {
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

        List<int[]> result = new ArrayList<>();

        for(int i = 1;i < intervals.length;i ++) {
            if(intervals[i][0] <= intervals[i - 1][1]) {
                intervals[i][0] = Math.min(intervals[i][0], intervals[i - 1][0]);
                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
            } else {
                result.add(intervals[i - 1]);
            }
        }

        result.add(intervals[intervals.length - 1]);

        return result.toArray(new int[0][]);
    }
}
