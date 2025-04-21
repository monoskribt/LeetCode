package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Stack<Node> stackOfNode = new Stack<>();
        Stack<Integer> stackOfDepth = new Stack<>();

        stackOfNode.add(root);
        stackOfDepth.add(1);

        int maxDepth = 0;

        while (!stackOfNode.isEmpty()) {
            Node currentNode = stackOfNode.pop();
            int currentDepth = stackOfDepth.pop();

            maxDepth = Math.max(maxDepth, currentDepth);

            if (currentNode.children != null) {
                for (Node node : currentNode.children) {
                    stackOfNode.push(node);
                    stackOfDepth.push(currentDepth + 1);
                }
            }
        }

        return maxDepth;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
