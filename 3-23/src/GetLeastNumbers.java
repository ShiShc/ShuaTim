import java.util.ArrayList;
import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 15:04
 * @Auther:ShiShc
 */

public class GetLeastNumbers {

    public ArrayList<Integer> GetLeastNumbers(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length || k == 0) return list;
        quickSort(input, 0, input.length - 1);
        for(int i = 0;i < k;i ++) {
            list.add(input[i]);
        }
        return list;
    }

    private void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int i = left, j = right, key = arr[i];
            while(i < j) {
                while(i < j && arr[j] >= key) j--;
                if(i < j) arr[i++] = arr[j];
                while(i < j && arr[i] < key) i++;
                if(i < j) arr[j--] = arr[i];
            }

            arr[i] = key;
            quickSort(arr, left, i-1);
            quickSort(arr, i+1, right);
        }
    }


    public static void main(String[] args) {

    }
}
