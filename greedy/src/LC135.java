import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC135 {
    public int candy(int[] ratings) {
        int[] arr = new int[ratings.length];
        Arrays.fill(arr, 1);

        for(int i = 0;i < ratings.length - 1;i ++) {
            if(ratings[i] < ratings[i + 1]) arr[i + 1] = arr[i] + 1;
        }

        for(int i = ratings.length - 2;i >= 0;i --) {
            if(ratings[i] > ratings[i + 1]) arr[i] = Math.max(arr[i], arr[i + 1] + 1);
        }

        int result = 0;
        for(int num : arr) {
            result += num;
        }

        return result;
    }

    public static void main(String[] args) {
        new LC135().candy(new int[]{1,0,2});
    }
}
