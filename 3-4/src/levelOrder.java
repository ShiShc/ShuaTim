import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 9:01
 * @Auther:ShiShc
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {this.val = x;}
}


public class levelOrder {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> resultTemp = new ArrayList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            resultTemp.add(temp.val);
            if(temp.left != null) queue.add(temp.left);
            if(temp.right != null) queue.add(temp.right);
        }

        int len = resultTemp.size();
        int[] result = new int[len];
        for(int i = 0;i < len; ++i) {
            result[i] = resultTemp.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
