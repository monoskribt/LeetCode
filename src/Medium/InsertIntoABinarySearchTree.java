package Medium;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        insertHelper(root, val);
        return root;
    }

    private void insertHelper(TreeNode treeNode, int val) {
        if(treeNode.val > val) {
            if(treeNode.left != null) {
                insertHelper(treeNode.left, val);
            } else {
                treeNode.left = new TreeNode(val);
            }
        } else if(treeNode.val < val) {
            if(treeNode.right != null) {
                insertHelper(treeNode.right, val);
            } else {
                treeNode.right = new TreeNode(val);
            }
        }
    }
}
