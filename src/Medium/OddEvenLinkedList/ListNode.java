package Medium.OddEvenLinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int count = 1;
        ListNode oddNode = new ListNode(0);
        ListNode tempOddNode = oddNode;

        ListNode evenNode = new ListNode(0);
        ListNode tempEvenNode = evenNode;

        while (temp != null) {
            if(count % 2 == 0) {
                tempEvenNode.next = new ListNode(temp.val);
                tempEvenNode = tempEvenNode.next;
            }
            else {
                tempOddNode.next = new ListNode(temp.val);
                tempOddNode = tempOddNode.next;
            }
            temp = temp.next;
            count++;
        }

        tempOddNode.next = null;
        tempOddNode.next = evenNode.next;

        return oddNode.next;
    }


    public static void main(String[] args) {
        // Создание узлов списка
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Соединение узлов
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Головной узел списка
        ListNode head = node1;

        ListNode result = oddEvenList(head);


        printList(result);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
