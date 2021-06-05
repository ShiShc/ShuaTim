import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/6, 10:33
 * @Auther:ShiShc
 */

public class firstUniqChar {

    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] array = s.toCharArray();

        for(char c : array) {
            map.put(c, !map.containsKey(c));
        }

        for(char c : array) {
            if(map.get(c)) return c;
        }

        return ' ';
    }

    public static void main(String[] args) {

    }
}
