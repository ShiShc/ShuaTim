/**
 * @date: 2021-5-3, 09:22
 * @author: ShiShc
 */

public class reverse {
    public int f(int x) {
        long temp = 0;
        while(x != 0) {
            temp = temp * 10 +  x % 10;
            x /= 10;
        }
        if(temp >= Integer.MAX_VALUE || temp <= Integer.MIN_VALUE) {
            temp = 0;
        }

        return (int)temp;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new reverse().f(Integer.MAX_VALUE));
        System.out.println(new reverse().f(Integer.MAX_VALUE - 1));

    }
}
