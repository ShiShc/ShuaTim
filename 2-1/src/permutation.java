import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/1, 15:50
 * @Auther:ShiShc
 */

public class permutation {
    /**
     * 回溯的示例代码
     */

    List<String> result = new LinkedList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return result.toArray(new String[result.size()]);
    }

    void dfs(int x) {
        if(x == c.length-1) {
            result.add(String.valueOf(c));
            return ;
        }

        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; ++i) {
            if(set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    void swap(int a, int b) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }

    public static void main(String[] args) {
        permutation obj = new permutation();
        String[] result = obj.permutation("abbc");
        for(int i = 0;i < result.length; ++i) {
            System.out.println(result[i]);
        }
    }
}
