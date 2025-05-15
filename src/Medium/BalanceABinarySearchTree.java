package Medium;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {

    private final List<Integer> nodeList = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorderTraversal(root);
        root = createTree(0, nodeList.size() - 1);
        return root;
    }

    public void inorderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }

        inorderTraversal(node.left);
        nodeList.add(node.val);
        inorderTraversal(node.right);
    }

    private TreeNode createTree(int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nodeList.get(mid));
        root.left = createTree(start, mid - 1);
        root.right = createTree(mid + 1, end);

        return root;
    }
}
