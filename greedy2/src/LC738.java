/**
 * @author: ShiShc
 * @desc:
 */
public class LC738 {
    public int monotoneIncreasingDigits(int n) {
        char[] s = String.valueOf(n).toCharArray();
        int flag = s.length;
        for(int i = s.length - 1; i > 0;i --) {
            if(s[i] < s[i - 1]) {
                flag = i;
                s[i - 1] --;
            }
        }

        for(int index = flag; index < s.length; index ++) {
            s[index] = '9';
        }

        return Integer.parseInt(String.valueOf(s));
    }

    public static void main(String[] args) {
        System.out.println(new LC738().monotoneIncreasingDigits(10));
    }
}
