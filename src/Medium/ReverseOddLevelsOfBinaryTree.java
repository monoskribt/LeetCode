package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseOddLevelsOfBinaryTree {
    private final List<Integer> countElementOnLevels = List.of(
            1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
    );
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) {
            return null;
        }

        Queue<TreeNode> queueOfTree = new LinkedList<>();
        queueOfTree.add(root);
        int level = 0;

        while (!queueOfTree.isEmpty()) {
            int size = queueOfTree.size();
            List<TreeNode> currentLevel = (level % 2 == 1) ? new ArrayList<>() : null;

            for(int i = 0; i < size; i++) {
                TreeNode node = queueOfTree.poll();
                if (currentLevel != null) {
                    currentLevel.add(node);
                }

                if (node.left != null) queueOfTree.offer(node.left);
                if (node.right != null) queueOfTree.offer(node.right);
            }

            if (currentLevel != null) {
                int i = 0, j = currentLevel.size() - 1;
                while (i < j) {
                    int temp = currentLevel.get(i).val;
                    currentLevel.get(i).val = currentLevel.get(j).val;
                    currentLevel.get(j).val = temp;
                    i++;
                    j--;
                }
            }

            level++;
        }
        return root;
    }
}
