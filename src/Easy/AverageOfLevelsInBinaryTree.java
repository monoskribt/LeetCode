package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageResult = new ArrayList<>();

        if(root == null) {
            return averageResult;
        }

        Queue<TreeNode> queueOfTree = new LinkedList<>();
        queueOfTree.offer(root);

        while (!queueOfTree.isEmpty()) {
            int sizeOfQueue = queueOfTree.size();
            double sum = 0.0;

            for (int i = 0; i < sizeOfQueue; i++) {
                TreeNode tree = queueOfTree.poll();
                sum += tree.val;

                if (tree.left != null) {
                    queueOfTree.offer(tree.left);
                }
                if (tree.right != null) {
                    queueOfTree.offer(tree.right);
                }
            }
            averageResult.add(sum / sizeOfQueue);
        }
        return averageResult;
    }
}
