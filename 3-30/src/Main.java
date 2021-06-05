import java.util.Arrays;
import java.util.Scanner;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/30, 19:35
 * @Auther:ShiShc
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] nums = new int[N];
//        for(int i = 0;i < N;i ++) {
//            nums[i] = scanner.nextInt();
//        }
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] nums = new int[2*n];
        for(int i = 0;i < 2*n;i ++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);

        if(p == 0) {
            int sum = 0;
            for(int i = 0;i < 2*n; i=i+2) {
                sum += nums[i];
            }
            System.out.println(sum);
        } else if(p > 50) {
            long sum = 0;
            for(int i = 2*n-1; i > n-1;i--) {
                sum += ((long) nums[i] * p);
            }
            for(int i = n-1;i >= 0; i--) {
                sum += ((long) nums[i] * (100-p));
            }
            System.out.println(sum/100.0);
        } else {
            long sum = 0;
            for(int i = 2*n-1; i > n-1;i--) {
                sum += ((long) nums[i] * (100-p));
            }
            for(int i = n-1;i >= 0; i--) {
                sum += ((long) nums[i] * p);
            }
            System.out.println(sum/100.0);
        }

    }
}
