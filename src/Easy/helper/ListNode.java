package Easy.helper;


import java.util.EmptyStackException;
import java.util.HashSet;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode current = new ListNode(0);
        ListNode temp = current;

        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 == null) {
            temp.next = list2;
        }
        else {
            temp.next = list1;
        }
        return current.next;
    }


    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null) {
            throw new EmptyStackException();
        }

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }


    public static ListNode reverse(ListNode head) {

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


    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode fastPoint = head;
        ListNode slowPoint = head;

        while (fastPoint != null && fastPoint.next != null) {
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next.next;
        }

        ListNode reversedListHead = reverse(slowPoint);

        ListNode firstPointer = head;
        ListNode secondPointer = reversedListHead;

        while (secondPointer != null) {
            if(firstPointer.val != secondPointer.val) {
                return false;
            }
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return true;
    }

    public static ListNode middleNode(ListNode head) {

        if(head == null) {
            return null;
        }

        if(head.next == null) {
            return head;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;

    }

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            // Сначала двигаем указатели
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            // Проверяем, совпали ли указатели
            if (fastPointer == slowPointer) {
                return true;
            }
        }

        return false;
    }

    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        if(head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {
            if(current.next.val != val) {
                current = current.next;
            }
            else {
                current.next = current.next.next;
            }
        }

        return head;

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode tempA = headA;

        while (tempA != null) {
            set.add(tempA);
            tempA = tempA.next;
        }

        ListNode tempB = headB;

        while (tempB != null) {
            if(set.contains(tempB)) {
                return tempB;
            }
            else {
                tempB = tempB.next;
            }
        }

        return null;
    }



    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(6);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next.next = new ListNode(6);





        // Выводим результат

        ListNode result = removeElements(list1, 6);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println("Finish");

    }
}
