package Easy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                (a, b) -> b[1] - a[1]
        );

        priorityQueue.addAll(Arrays.asList(boxTypes));
        int result = 0;

        while (truckSize > 0 && !priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int countOfBox = Math.min(truckSize, current[0]);
            result += countOfBox * current[1];
            truckSize -= countOfBox;
        }

        return result;
    }
}
