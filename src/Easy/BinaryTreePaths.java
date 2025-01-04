package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String path = "";
        helperMethod(root, path, list);
        return list;
    }

    private void helperMethod(TreeNode node, String path, List<String> listPath) {
        if(node != null) {
            path += node.val;

            if(node.left == null && node.right == null) {
                listPath.add(path);
            }
            else {
                helperMethod(node.left, path + "->", listPath);
                helperMethod(node.right, path + "->", listPath);
            }
        }
    }

}
