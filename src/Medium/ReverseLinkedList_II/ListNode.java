package Medium.ReverseLinkedList_II;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode leftPoint = null;
        ListNode rightPoint = null;
        int count = 1;

        while (temp != null) {
            if (count == left) {
                leftPoint = temp;
            }
            if (count == right) {
                rightPoint = temp;
            }
            temp = temp.next;
            count++;
        }

        if (leftPoint == null || rightPoint == null) {
            return head;
        }

        while (left < right) {
            int tempValue = leftPoint.val;
            leftPoint.val = rightPoint.val;
            rightPoint.val = tempValue;
            left++;
            right--;
            leftPoint = leftPoint.next;


            temp = head;
            for (int i = 1; i < right; i++) {
                temp = temp.next;
            }
            rightPoint = temp;
        }

        return head;
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

            ListNode head = node1;

            ListNode result = reverseBetween(head, 1, 5);

            printList(head);
        }

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
        }


}

