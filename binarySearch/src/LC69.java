/**
 * @author: ShiShc
 * @desc:
 */
public class LC69 {
    public int mySqrt(int x) {
        return binarySearch(x);
    }

    private int binarySearch(int x) {
        if(x == 1) {
            return 1;
        }

        int left = 1, right = x / 2, result = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(mid * mid <= x) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
