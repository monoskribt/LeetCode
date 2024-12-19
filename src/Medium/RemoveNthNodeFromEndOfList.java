package Medium;




class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n <= 0) {
            return null;
        }

        ListNode tempToSize = head;
        int sizeOfList = 0;

        while (tempToSize != null) {
            sizeOfList++;
            tempToSize = tempToSize.next;
        }

        if(n > sizeOfList) {
            return head;
        }

        if(sizeOfList == 1) {
            return head = null;
        }

        int count = 0;
        int indexOfTargetElement = sizeOfList - n;
        ListNode deleted = head;
        ListNode prev = null;
        while (count != indexOfTargetElement) {
            prev = deleted;
            deleted = deleted.next;
            count++;
        }

        if(prev == null) {
            head = head.next;
        }
        else {
            prev.next = deleted.next;
        }

        return head;
    }


    public static void main(String[] args) {
        // Создаем узлы списка
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);


        // Связываем узлы
        node1.next = node2; // 1 -> 2



        ListNode head = node1;

        head = removeNthFromEnd(head, 2);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
