import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class LC406 {
    public int[][] reconstructQueue(int[][] people) {
        // bubble sort
        for(int i = 0;i < people.length - 1;i ++) {
            for(int j = 0;j < people.length - 1 - i;j ++) {
                if(people[j][0] < people[j + 1][0]) {
                    int temp1 = people[j][0];
                    int temp2 = people[j][1];
                    people[j][0] = people[j+1][0];
                    people[j][1] = people[j+1][1];
                    people[j+1][0] = temp1;
                    people[j+1][1] = temp2;
                } else if(people[j][0] == people[j + 1][0]) {
                    if(people[j][1] > people[j + 1][1]) {
                        int temp = people[j][1];
                        people[j][1] = people[j+1][1];
                        people[j+1][1] = temp;
                    }
                }
            }
        }

        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 0;i < people.length;i ++) {
            int position = people[i][1];
            result.add(position, people[i]);
        }

        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        // [[9,0],[7,0],[1,9],[3,0],[2,7],[5,3],[6,0],[3,4],[6,2],[5,2]]
        int[][] people = new int[][] {
                {9,0},
                {7,0},
                {1,9},
                {3,0},
                {2,7},
                {5,3},
                {6,0},
                {3,4},
                {6,2},
                {5,2}
        };

        System.out.println(Arrays.deepToString(new LC406().reconstructQueue(people)));
    }


}
