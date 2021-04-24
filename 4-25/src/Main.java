import java.util.ArrayList;
import java.util.Scanner;

/**
 * @date: 2021-4-24, 15:28
 * @author: ShiShc
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int u = scanner.nextInt();
        int target = u - h;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i ++) {
            list.add(scanner.nextInt());
        }

        if(target <= 0) {
            System.out.println(0);
        } else {
            list.sort((x,y) -> (y-x));
            int sum = 0;
            for(int num : list) {
                sum ++;
                if(num < target) {
                    target -= num;
                } else {
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
