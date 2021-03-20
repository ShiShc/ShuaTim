import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 16:32
 * @Auther:ShiShc
 */

//从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
//
//
//        例如:
//        给定二叉树:[3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回：
//
//        [3,9,20,15,7]

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}

public class levelOrder {

    public static int[] levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();

        while(!queue.isEmpty()) {
            TreeNode temp = queue.pollFirst();
            list.add(temp.val);
            if(temp.left != null) queue.addLast(temp.left);
            if(temp.right != null) queue.addLast(temp.right);
        }

        int[] result = new int[list.size()];
        for(int i = 0;i < list.size(); ++i) {
            result[i] = list.get(i);
        }

        return  result;
    }

    public static void main(String[] args) {

    }
}
