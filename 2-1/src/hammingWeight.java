/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 15:24
 * @Auther:ShiShc
 */

public class hammingWeight {

    public static int hammingWeight(int n) {

        /**
         *  >> : 右移
         *  >>> : 无符号右移
         *  两者对于正数来说无区别，对于负数，右移补上符号位，无符号右移则添0
         */

        int result = 0;
        while(n != 0) {
            result  += n & 1;
            n >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
}
