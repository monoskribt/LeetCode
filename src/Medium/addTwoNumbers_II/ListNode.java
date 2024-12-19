package Medium.addTwoNumbers_II;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversedL1 = reversedList(l1);
        ListNode reversedL2 = reversedList(l2);

        ListNode resultNode = null;
        int potentialTen = 0;

        while (reversedL1 != null || reversedL2 != null) {
            int valueL1 = (reversedL1 != null) ? reversedL1.val : 0;
            int valueL2 = (reversedL2 != null) ? reversedL2.val : 0;

            int sum = potentialTen + valueL1 + valueL2;
            potentialTen = sum / 10;

            ListNode newNode = new ListNode(sum % 10);
            newNode.next = resultNode;
            resultNode = newNode;

            if(reversedL1 != null) {
                reversedL1 = reversedL1.next;
            }

            if(reversedL2 != null) {
                reversedL2 = reversedL2.next;
            }
        }
        if(potentialTen > 0) {
            ListNode newListNode = new ListNode(potentialTen);
            newListNode.next = resultNode;
            resultNode = newListNode;
        }

        return resultNode;
    }


    private static ListNode reversedList(ListNode list) {
        if(list == null) {
            return null;
        }

        ListNode currrentNode = list;
        ListNode nextNode = currrentNode;
        ListNode prevNode = null;

        while (currrentNode != null) {
            nextNode = currrentNode.next;
            currrentNode.next = prevNode;
            prevNode = currrentNode;
            currrentNode = nextNode;
        }

        return list = prevNode;
    }
}
