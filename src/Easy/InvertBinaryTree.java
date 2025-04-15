package Easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        Queue<TreeNode> tempQueue = new LinkedList<>();
        tempQueue.add(root);

        while (!tempQueue.isEmpty()) {
            TreeNode tempTreeFromQueue = tempQueue.poll();

            TreeNode temp = tempTreeFromQueue.left;
            tempTreeFromQueue.left = tempTreeFromQueue.right;
            tempTreeFromQueue.right = temp;

            if(tempTreeFromQueue.left != null) {
                tempQueue.add(tempTreeFromQueue.left);
            }

            if(tempTreeFromQueue.right != null) {
                tempQueue.add(tempTreeFromQueue.right);
            }
        }

        return root;
    }

}
