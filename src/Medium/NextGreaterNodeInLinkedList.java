package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        if(head == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int[] output = new int[list.size()];
        Stack<Integer> stack = new Stack<>();

        for(int i = list.size() - 1; i >= 0 ; i--) {

            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                output[i] = 0;
            }
            else {
                output[i] = stack.peek();
            }

            stack.push(list.get(i));

        }

        return output;

    }

    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }


    public static void main(String[] args) {
        int[] values = {1, 7, 5, 1, 9, 2, 5, 1};
        ListNode head = createLinkedList(values);

        // Здесь можно протестировать ваш метод nextLargerNodes
        int[] result = new NextGreaterNodeInLinkedList().nextLargerNodes(head);

        // Вывод результата
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

}
