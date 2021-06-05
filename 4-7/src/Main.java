import java.util.HashMap;
import java.util.Scanner;

/**
 * @date:2021/4/7, 19:04
 * @author:ShiShc
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        String[][] name = new String[N][2];
        HashMap<String, Integer> dic = new HashMap<>(16);
        for(int i = 0;i < N;i ++) {
            name[i][0] = scanner.next();
            name[i][1] = scanner.next();
            dic.put(name[i][0], i);
        }

        boolean[] dp = new boolean[N];
        int count = 0;
        for(int i = 0;i < N;i ++) {
            int temp = i;
            if(!dp[i] && !dp[dic.get(name[i][1])]) {
                while(!dp[temp]) {
                    dp[temp] = true;
                    temp = dic.get(name[temp][1]);
                }
                count ++;
            }
        }

        System.out.println(count);
    }
}
