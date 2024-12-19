package Medium;

import java.util.Random;

public class LinkedListRandomNode {

    private ListNode head;
    private int count = 0;
    private Random random;

    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.random = new Random();

        ListNode temp = head;
        while (temp!= null) {
            count++;
            temp =temp.next;
        }
    }

    public int getRandom() {
        int position = random.nextInt(count);
        ListNode temp = head;

        for(int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

}
