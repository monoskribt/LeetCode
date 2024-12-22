package Easy;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricHelperFun(root.left, root.right);
    }

    private boolean isSymmetricHelperFun(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }

        if(left == null || right == null) {
            return false;
        }

        if(left.val != right.val) {
            return false;
        }

        return isSymmetricHelperFun(left.left, right.right) && isSymmetricHelperFun(left.right, right.left);
    }

}
