package Medium.LinkedListCycle_II;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}

    public ListNode detectCycle(ListNode head) {
        ListNode fastPoint = head;
        ListNode slowPoint = head;

        while (fastPoint != null && fastPoint.next != null) {
            fastPoint = fastPoint.next.next;
            slowPoint = slowPoint.next;

            if(fastPoint == slowPoint) {
                return getCycleNode(head, slowPoint);
            }
        }

        return null;
    }


    private static ListNode getCycleNode(ListNode head, ListNode slowPoint) {
        ListNode temp = head;

        while (temp != slowPoint) {
            temp = temp.next;
            slowPoint = slowPoint.next;
        }

        return temp;
    }
}
