import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/3, 21:09
 * @Auther:ShiShc
 */

public class getLeastNumbers {

    public static int[] getLeastNumbers(int[] arr, int k) {
        if(arr == null || arr.length == 0) return null;

        Arrays.sort(arr);
        int[] result = new int[k];
        for(int i = 0;i < k; ++i) {
            result[i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,6};
        int[] result = getLeastNumbers(arr, 3);
        for(int i = 0;i < 3; ++i) {
            System.out.println(result[i]);
        }
    }

}
