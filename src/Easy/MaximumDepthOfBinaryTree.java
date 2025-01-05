package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> depthQueue = new LinkedList<>();
        depthQueue.add(root);
        int depthCount = 0;

        while (!depthQueue.isEmpty()) {
            depthCount++;
            int levelSize = depthQueue.size();

            for(int i = 0; i < levelSize; i++) {
                TreeNode node = depthQueue.poll();

                if(node.left != null) {
                    depthQueue.add(node.left);
                }
                if(node.right != null) {
                    depthQueue.add(node.right);
                }
            }
        }

        return depthCount;
    }

}
