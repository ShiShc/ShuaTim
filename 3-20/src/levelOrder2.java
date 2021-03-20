import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 16:49
 * @Auther:ShiShc
 */

public class levelOrder2 {

    public static List<List<Integer>> levelOrder2(TreeNode root) {
        if(root == null) return new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();

        while(!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            TreeNode node = queue.pollFirst();
            temp.add(node.val);

        }

    }

    public static void main(String[] args) {

    }
}
