package Easy;

import java.util.*;


public class LargestNumberAfterDigitSwapsByParity {

    public static int largestInteger(int num) {
        PriorityQueue<Integer> evenNumbers = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> oddNumbers = new PriorityQueue<>(Comparator.reverseOrder());
        LinkedList<Integer> originalNums = new LinkedList<>();

        while (num > 0) {
            int temp = num % 10;
            num =  num / 10;
            originalNums.addFirst(temp);

            if(temp % 2 == 0) {
                evenNumbers.add(temp);
            }
            else {
                oddNumbers.add(temp);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int el : originalNums) {
            if (el % 2 == 0) {
                sb.append(evenNumbers.poll());
            }
            else {
                sb.append(oddNumbers.poll());
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int result = largestInteger(65875);
        System.out.println(result);
    }
}
