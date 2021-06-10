

/**
 * @author: ShiShc
 * @desc:
 */
public class LC860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0;

        for(int bill : bills) {
            if(bill == 5) fiveCount ++;
            if(bill == 10) {
                if(fiveCount == 0) {
                    return false;
                }
                tenCount ++;
                fiveCount --;
            }
            if(bill == 20) {
                if(tenCount > 0 && fiveCount > 0) {
                    tenCount --;
                    fiveCount --;
                    continue;
                }
                if(fiveCount >= 3) {
                    fiveCount -= 3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LC860().lemonadeChange(new int[]{5, 5, 5, 5, 20, 20, 5, 5, 5, 5}));
    }
}
