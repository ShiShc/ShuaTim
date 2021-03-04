/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 13:05
 * @Auther:ShiShc
 */

public class fib {

    public int fib(int n) {
        int f0 = 0, f1 = 1, result = 0;

        if(n == 0) return 0;
        if(n == 1) return 1;

        for(int i = 1;i < n; ++i) {
            result = (f0+f1) % 1000000007;
            f0 = f1;
            f1 = result;
        }

        return result;
    }

    public static void main(String[] args) {
        fib fib = new fib();

        System.out.println(fib.fib(2));
        System.out.println(fib.fib(3));
        System.out.println(fib.fib(4));
        System.out.println(fib.fib(5));
    }
}
