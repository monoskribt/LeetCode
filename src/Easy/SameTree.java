package Easy;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        if(p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        SameTree sameTree = new SameTree();

        // Создаем дерево p: [1, 2, 3]
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Создаем дерево q: [1, 2, 3]
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        // Тестируем метод isSameTree
        boolean result = sameTree.isSameTree(p, q);
        System.out.println("Are trees p and q the same? " + result);
    }
}
