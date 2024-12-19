package Medium.InsertionSortList;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode insertionSortList(ListNode head) {
        ListNode resultNode = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            ListNode prev = resultNode;

            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            ListNode nextNode = current.next;

            current.next = prev.next;
            prev.next = current;


            current = nextNode;
        }

        return resultNode.next;
    }


    public static void main(String[] args) {
        // Создаем связанный список 4 -> 2 -> 1 -> 3
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Исходный список:");
        printList(node1);

        // Сортируем список
        ListNode sortedList = insertionSortList(node1);

        System.out.println("Отсортированный список:");
        printList(sortedList);
    }


    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


}
