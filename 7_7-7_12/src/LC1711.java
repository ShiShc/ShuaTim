import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LC1711 {

    int result = 0;
    LinkedList<Integer> path = new LinkedList<>();

    public int countPairs(int[] delicious) {
        help(delicious, 0);
        return result;
    }

    private void help(int[] delicious, int index) {
        if(path.size() == 2) {
            if(Integer.toBinaryString(path.get(0) + path.get(1)).lastIndexOf("1") == 0) {
                result ++;
            }
            return ;
        }

        for(int i = index;i < delicious.length;i ++) {
            path.add(delicious[i]);
            help(delicious, i + 1);
            path.removeLast();
        }
    }

    public int countPairs2(int[] delicious) {
        int result = 0;
        for(int i = 0;i < delicious.length - 1;i ++) {
            for(int j = i + 1;j < delicious.length;j ++) {
                if(Integer.toBinaryString(delicious[i] + delicious[j]).lastIndexOf("1") == 0) {
                    result ++;
                }
            }
        }

        return result;
    }

    public int countPairs3(int[] delicious) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : delicious) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] array = map.keySet().toArray(new Integer[] {});

        for(int i = 0;i < array.length;i ++) {
            int num1 = map.get(array[i]);
            if(Integer.toBinaryString(array[i] << 1).lastIndexOf("1") == 0) {
                result += num1 > 1 ? num1 * (num1 - 1) >> 1 : 0;
            }
            for(int j = i + 1;j < array.length;j ++) {
                if(Integer.toBinaryString(array[i] + array[j]).lastIndexOf("1") == 0) {
                    result += num1 * map.get(array[j]);
                    result %= 1000000007;
                }
            }
        }

        return result;
    }

    public int countPairs4(int[] delicious) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : delicious) {
            int MAX_VALUE = 1;
            for(int i = 0;i <= 21;i ++) {
                if(num <= MAX_VALUE && map.containsKey(MAX_VALUE - num)) {
                    result += map.get(MAX_VALUE - num);
                }
                MAX_VALUE <<= 1;
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return result % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new LC1711().countPairs4(new int[]{149,107,1,63,0,1,6867,1325,5611,2581,39,89,46,18,12,20,22,234}));
        //System.out.println(new LC1711().countPairs3(new int[]{1,1,1,3,3,3,7}));
    }

}
