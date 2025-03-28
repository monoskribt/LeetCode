package Medium.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    List<Integer> list = new ArrayList<>();


    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        }

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }


    public static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
    }
}
