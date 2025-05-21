package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private final List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        someOrder(root, new StringBuilder());
        return list;
    }

    private void someOrder(TreeNode node, StringBuilder sb) {
        if(node != null) {
            sb.append(node.val);

            if(node.left == null && node.right == null) {
                list.add(sb.toString());
            }
            else {
                someOrder(node.left, sb.append("->"));
                someOrder(node.right, sb.append("->"));
            }
        }
    }



}
