package Medium;

public class KthSmallestElementInABST {

    private static int counter = 0;
    private static int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
    }

    private void inOrder(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        inOrder(root.left, k);

        counter++;
        if (counter == k) {
            result = root.val;
            return;
        }

        inOrder(root.right, k);
    }
}
