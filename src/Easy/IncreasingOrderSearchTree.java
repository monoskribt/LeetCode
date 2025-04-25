package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class IncreasingOrderSearchTree {
    private static Queue<Integer> queue = new LinkedList<>();

    public static TreeNode increasingBST(TreeNode root) {
        inOrder(root);
        TreeNode resultTree = new TreeNode(queue.poll());
        TreeNode temp = resultTree;

        while (!queue.isEmpty()) {
            temp.right = new TreeNode(queue.poll());
            temp = temp.right;
        }

        return resultTree;
    }

    private static void inOrder(TreeNode node) {
        if(node == null) {
            return;
        }

        inOrder(node.left);
        queue.add(node.val);
        inOrder(node.right);
    }
}
