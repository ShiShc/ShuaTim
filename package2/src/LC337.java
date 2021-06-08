import java.util.ArrayList;
import java.util.List;

/**
 * @author: ShiShc
 * @desc:
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LC337 {
    public int rob(TreeNode root) {
        List<Integer> result = robTree(root);
        return Math.max(result.get(0), result.get(1));
    }

    private List<Integer> robTree(TreeNode node) {
        if(node == null) return new ArrayList<Integer>() {{add(0); add(0);}};

        List<Integer> left = robTree(node.left);
        List<Integer> right = robTree(node.right);

        int val1 = node.val + left.get(0) + right.get(0);
        int val2 = Math.max(left.get(0), left.get(1)) + Math.max(right.get(0), right.get(1));

        return new ArrayList<Integer>() {{add(val2); add(val1); }};
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        System.out.println(new LC337().rob(root));
    }
}
