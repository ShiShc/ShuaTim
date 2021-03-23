import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 15:28
 * @Auther:ShiShc
 */

public class twoSum {

    public int[] towSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; ++i) {
            if(map.containsKey(target - numbers[i])) {
                return new int[] {map.get(target - numbers[i]), i};
            }
            map.put(numbers[i], i);
        }
        return new int[0];
    }


    public static void main(String[] args) {

    }
}
