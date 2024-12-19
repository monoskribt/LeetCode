package Medium.RemoveNodesFromLinkedList;

import java.util.EmptyStackException;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode removeNodes(ListNode head) {
        if(head == null) {
            throw new EmptyStackException();
        }

        ListNode reversedList = reverse(head);
        ListNode current = reversedList;

        ListNode maxNode = reversedList;
        ListNode resultNode = new ListNode(0);
        ListNode tail = resultNode;

        while (current != null) {
            if(current.val >= maxNode.val) {
                maxNode = current;
                tail.next = current;
                tail = tail.next;
            }
            current = current.next;
        }

        tail.next = null;
        return reverse(resultNode.next);
    }


    private static ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode current = head;
        ListNode next = current;
        ListNode prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return head = prev;
    }



    public static void main(String[] args) {
        // Создаём связанный список: 5 -> 2 -> 13 -> 3 -> 8
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);

        // Вызываем метод removeNodes
        ListNode result = removeNodes(head);

        // Выводим результат
        printList(result);
    }

    // Метод для вывода связанного списка
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
