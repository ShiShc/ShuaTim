import java.util.ArrayList;

/**
 * @date: 2021-5-3, 10:06
 * @author: ShiShc
 */

public class TreeAncestor {

    int n;
    int[] parent;

    public TreeAncestor(int n, int[] parent) {
        this.n = n;
        this.parent = parent;
    }

    public int getKthAncestor(int node, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        while(node != -1) {
            list.add(node);
            node = parent[node];
        }

        return k >= list.size() ? -1 : list.get(k);
    }

    public static void main(String[] args) {
        TreeAncestor obj = new TreeAncestor(7, new int[]{-1, 0, 0, 1, 1, 2, 2,});
        System.out.println(obj.getKthAncestor(3, 1));
        System.out.println(obj.getKthAncestor(5, 2));
        System.out.println(obj.getKthAncestor(6, 3));
    }

}
