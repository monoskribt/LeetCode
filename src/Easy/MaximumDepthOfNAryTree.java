package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MaximumDepthOfNAryTree {

    public static void main(String[] args) {
        // Построим дерево вручную

        Node node14 = new Node(14);
        Node node13 = new Node(13, List.of(node14));
        Node node12 = new Node(12, List.of(node13));
        Node node11 = new Node(11, List.of(node12));
        Node node10 = new Node(10, List.of(node11));
        Node node9 = new Node(9);
        Node node8 = new Node(8, Arrays.asList(node9, node10));
        Node node7 = new Node(7);
        Node node6 = new Node(6, Arrays.asList(node7, node8));
        Node node5 = new Node(5, List.of(node6));
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node root = new Node(1, Arrays.asList(node2, node3, node4, node5));

        MaximumDepthOfNAryTree solution = new MaximumDepthOfNAryTree();
        int result = solution.maxDepth(root);

        System.out.println("Maximum depth: " + result);
    }

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
