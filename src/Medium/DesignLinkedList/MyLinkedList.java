package Medium.DesignLinkedList;

import java.util.EmptyStackException;

public class MyLinkedList {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }




    public int get(int index) {
        if(head == null) {
            throw new EmptyStackException();
        }

        if(index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        int count = 1;
        ListNode temp = head;

        while(temp != null) {
            if(count == index) {
                return temp.val;
            }
            else {
                temp = temp.next;
            }
        }

        return -1;
    }

    public void addFirst(int value) {
        ListNode newNode = new ListNode(value);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode tailNode = new ListNode(val);

        if(head == null) {
            head = tailNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = tailNode;

        length++;
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);

        if(head == null) {
            head = newNode;
            return;
        }

        if(index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }


        ListNode temp = head;
        int count = 1;

        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        ListNode next = temp.next;
        temp.next = newNode;
        newNode.next = next;

        length++;
    }

    public void deleteAtIndex(int index) {
        if(head == null) {
            throw new EmptyStackException();
        }

        if(index < 0 || index > length) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 1) {
            head = head.next;
        }

        else {
            ListNode prev = head;
            int count = 1;

            while (count < index - 1) {
                prev = prev.next;
                count++;
            }
            ListNode current = prev.next;
            prev.next = current.next;
            length--;
        }
    }

}
