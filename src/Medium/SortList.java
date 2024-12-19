package Medium;

import java.util.Arrays;

public class SortList {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int counter = 0;

        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        ListNode toInput = head;
        int[] array = new int[counter];
        for(int i = 0; i < array.length; i++) {
            array[i] = toInput.val;
            toInput = toInput.next;
        }

        Arrays.sort(array);

        ListNode dummy = head;
        for (int i : array) {
            dummy.val = i;
            dummy = dummy.next;
        }

        return head;
    }


    private static ListNode mergeList(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (left != null && right != null) {
            if(left.val < right.val) {
                temp.next = left;
                left = left.next;
            }
            else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) {
            temp.next = left;
        }
        if (right != null) {
            temp.next = right;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(-1);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(0);

        SortList sortList = new SortList();
        ListNode sortedHead = sortList.sortList(head);

        printList(sortedHead);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}
