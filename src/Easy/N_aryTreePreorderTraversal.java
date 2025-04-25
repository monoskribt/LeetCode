package Easy;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {

    private List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        preOrderHelper(root);
        return list;
    }

    private void preOrderHelper(Node node) {
        if(node == null) {
            return;
        }

        list.add(node.val);

        for(Node current : node.children) {
            preorder(current);
        }
    }
}
