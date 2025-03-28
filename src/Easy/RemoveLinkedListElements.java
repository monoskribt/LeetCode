package Easy;


 class ListNode {
     int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }

        if(head.next == null && head.val == val) {
            return head;
        }

        ListNode temp = head;

        while (temp.next != null) {

            if(temp.next.val == val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }

        return head;
    }
}
