/**
 * @author: ShiShc
 * @desc:
 */
public class LC367 {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;

        long left = 1, right = num / 2, result = -1;
        while(left <= right) {
            long mid = (left + right) / 2;
            if(mid * mid == num) {
                result = mid;
                break;
            } else if(mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result != -1;
    }

    public static void main(String[] args) {
//        System.out.println(new LC367().isPerfectSquare(16));
//        System.out.println(new LC367().isPerfectSquare(14));
//        System.out.println(new LC367().isPerfectSquare(255));
//        System.out.println(new LC367().isPerfectSquare(256));
        System.out.println(new LC367().isPerfectSquare(808201));
        //System.out.println(Math.sqrt((double) 808201));
    }
}
