package Medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InsertGreatestCommonDivisorsInLinkedList {

    private static final Set<Integer> primaryNumbers = Set.of(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
            59, 61, 67, 71, 73, 79, 83, 89, 97
    );

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null) {
            return head;
        }

        if(head != null && head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode prev = null;

        while (first.next != null) {
            prev = first;
            first = first.next;

            ListNode insertNode = new ListNode(getMaxCommonDivision(first.val, prev.val));

            prev.next = insertNode;
            insertNode.next = first;
        }

        return head;
    }

    private static int getMaxCommonDivision(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }


    public static void main(String[] args) {
        ListNode root = new ListNode(18);
        ListNode first = new ListNode(6);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(3);

        root.next = first;
        first.next = second;
        second.next = third;

        ListNode result = insertGreatestCommonDivisors(root);
    }
}
