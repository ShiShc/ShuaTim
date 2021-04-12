import java.util.HashMap;

/**
 * @date:2021-4-11, 23:33
 * @author:ShiShc
 */

public class buildTree {

    private HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode f(int[] preorder, int[] inorder) {
        for(int i = 0;i < inorder.length; ++i) {
            dic.put(inorder[i], i);
        }

        return help(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }

    private TreeNode help(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if(preLeft > preRight) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preLeft]);
        int nodeIndex = dic.get(preorder[preLeft]);
        int size_leftTree = nodeIndex - inLeft;
        node.left = help(preorder, inorder, preLeft+1, preLeft+size_leftTree, inLeft, nodeIndex-1);
        node.right = help(preorder, inorder, preLeft+1+size_leftTree,preRight, nodeIndex+1, inRight);
        return node;
    }


    public static void main(String[] args) {

    }
}
