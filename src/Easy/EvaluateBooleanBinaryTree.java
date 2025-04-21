package Easy;

public class EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        if(root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean leftEvaluateTree = evaluateTree(root.left);
        boolean rightEvaluateTree = evaluateTree(root.right);

        if(root.val == 2) {
            return leftEvaluateTree || rightEvaluateTree;
        }
        else {
            return leftEvaluateTree && rightEvaluateTree;
        }
    }
}
