package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> treeLeftQueue = new LinkedList<>();
        Queue<TreeNode> treeRightQueue = new LinkedList<>();


        if(root1 != null && root2 != null) {
            treeLeftQueue.add(root1);
            treeRightQueue.add(root2);
        }

        while (!treeLeftQueue.isEmpty() && !treeRightQueue.isEmpty()) {
            TreeNode tempLeft = treeLeftQueue.poll();
            TreeNode tempRight = treeRightQueue.poll();

            tempLeft.val += tempRight.val;

            if (tempLeft.left != null && tempRight.left != null) {
                treeLeftQueue.add(tempLeft.left);
                treeRightQueue.add(tempRight.left);
            } else if (tempLeft.left == null) {
                tempLeft.left = tempRight.left;
            }

            if (tempLeft.right != null && tempRight.right != null) {
                treeLeftQueue.add(tempLeft.right);
                treeRightQueue.add(tempRight.right);
            } else if (tempLeft.right == null) {
                tempLeft.right = tempRight.right;
            }
        }

        return root1;
    }
}
