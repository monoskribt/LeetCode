package Easy;

import java.util.*;

public class N_aryTreePostorderTraversal {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if(root == null) {
            return result;
        }

        for(Node node : root.children) {
            postorder(node);
        }

        result.add(root.val);
        return result;
    }
}
