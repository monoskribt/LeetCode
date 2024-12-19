package Medium.addTwoNumbers_I;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newList = new ListNode(0);
        ListNode temp = newList;

        int potentialTen = 0;
        while(l1 != null || l2 != null) {
            int valueL1 = (l1 != null) ? l1.val : 0;
            int valueL2 = (l2 != null) ? l2.val : 0;

            int sum = potentialTen + valueL1 + valueL2;
            potentialTen = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(potentialTen > 0) {
            temp.next = new ListNode(potentialTen);
            temp = temp.next;
        }

        return newList = newList.next;

    }


    public static void main(String[] args) {

        // Создаем первый связанный список: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2; // l1 -> l2
        l2.next = l3; // l2 -> l3

        // Создаем второй связанный список: 5 -> 6 -> 4
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);

        l4.next = l5; // l4 -> l5
        l5.next = l6; // l5 -> l6

        // Теперь вызываем метод для сложения двух списков
        ListNode newList = addTwoNumbers(l1, l4);

        // Выводим результат
        while(newList != null) {
            System.out.print(newList.val + "-->");
            newList = newList.next;
        }
        System.out.println("Finish");
    }

}
