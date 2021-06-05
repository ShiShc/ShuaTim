import java.util.ArrayList;
import java.util.Arrays;

/**
 * @date: 2021-5-6, 10:39
 * @author: ShiShc
 */

public class Decode {
    public int[] f(int[] encode, int first) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(first);
        int temp = first;
        for(int num : encode) {
            list.add(temp = (temp ^ num));
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Decode().f(new int[]{1, 2, 3}, 1)));
    }
}
