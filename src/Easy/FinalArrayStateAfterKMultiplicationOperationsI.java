package Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperationsI {

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]) {
                return Integer.compare(a[1] , b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(new int[] { nums[i], i });
        }

        for(int i = 0; i < k; i++) {
            int[] minValueArr = priorityQueue.poll();
            minValueArr[0] *= multiplier;
            priorityQueue.add(minValueArr);
        }

        while (!priorityQueue.isEmpty()) {
            int[] elArr = priorityQueue.poll();
            nums[elArr[1]] = elArr[0];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] test = new int[] {2,1,3,5,6};
        int[] testRes = getFinalState(test, 5, 2);

        System.out.println(testRes.toString());
    }
}
