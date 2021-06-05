import java.util.HashSet;
import java.util.Set;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC202 {
    private int getSum(int n) {
        int sum = 0;
        while(n != 0) {
            int temp = n % 10;
            sum += temp * temp;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> dic = new HashSet<>();
        while(true) {
            if(n == 1) {
                return true;
            }
            n = getSum(n);
            if(dic.contains(n)) {
                return false;
            }
            dic.add(n);
        }
    }
}
