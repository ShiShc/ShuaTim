/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 12:57
 * @Auther:ShiShc
 */

public class numWays {

    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0;i < n; ++i) {
            sum = (a+b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;
    }

    public static void main(String[] args) {

    }
}
