import java.util.Arrays;

/**
 * @date: 2021-5-22, 21:12
 * @author: ShiShc
 */

public class Expr32 {
    public int f(int[] times) {
        Arrays.sort(times);
        int result = 0;
        for(int i = 0;i < times.length;i ++) {
            if(i >= 1) {
                result += times[i - 1];
            }
            result += times[i];
        }

        return result;
    }
}
