import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC455 {
    public int findContentChildren(int[] g,int[] s) {
        int result = 0, index = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for(int i = 0;i < g.length && index < s.length;) {
            if(g[i] <= s[index]) {
                index ++;
                result ++;
                i ++;
            } else {
                index ++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC455().findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }
}
