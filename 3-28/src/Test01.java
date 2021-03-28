import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/28, 17:10
 * @Auther:ShiShc
 */

public class Test01 {
    /**
     * @param arr 传入的数组【有序无序均可】, a set S of n integers
     * @param target 和, another integer x.
     * @return 和为target的两数的下标
     */
    public int[] func1 (int[] arr, int target) {
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int i = 0;i < arr.length; ++i) {
            // (Key, Value) <=> (arr[i], i)
            if(hashtable.containsKey(target - arr[i])) {
                // return 两个数的下标
                return new int[] {hashtable.get(target - arr[i]), i};
            }
            hashtable.put(arr[i], i);
        }

        return new int[0];
    }

    /**
     * @param arr 传入的数组【有序】, a set S of n integers
     * @param target 和
     * @return 和为target的两个数
     */
    public int[] func2 (int[] arr, int target) {
        if(arr.length == 0) return new int[0];
        int left = 0, right = arr.length - 1;
        while(left < right) {
            if(arr[left] + arr[right] == target) {
                return new int[] {arr[left], arr[right]};
            } else if(arr[left] + arr[right] < target) {
                left ++;
            } else {
                right ++;
            }
        }

        return new int[0];
    }


    public static void main(String[] args) {}
}
