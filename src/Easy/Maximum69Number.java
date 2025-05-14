package Easy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Maximum69Number {

    public static int maximum69Number (int num) {
        LinkedList<Integer> list = new LinkedList<>();

        int copyNum = num;
        while (copyNum > 0) {
            int digit = copyNum % 10;
            copyNum = copyNum / 10;
            list.addFirst(digit);
        }

        int result = 0;
        int count = 0;
        while (!list.isEmpty()) {
            result *= 10;
            int current = list.poll();

            if(current == 6 && count < 1 ){
                current = 9;
                count++;
            }
            result += current;
        }

        return result;
    }

    public static void main(String[] args) {
        int test = maximum69Number(9669);
        System.out.println(test);
    }
}
