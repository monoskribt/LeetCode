package Easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class DeleteGreatestValueInEachRow {

    public int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer>[] heapGrid = new PriorityQueue[grid.length];

        for(int i = 0; i < grid.length; i++){
            heapGrid[i] = new PriorityQueue<>(Collections.reverseOrder());

            for(int el : grid[i]){
                heapGrid[i].offer(el);
            }
        }

        int result = 0;

        while (!heapGrid[0].isEmpty()) {
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < heapGrid.length; i++) {
                int current = heapGrid[i].poll();
                if(current > max) {
                    max = current;
                }
            }

            result += max;
        }

        return result;
    }
}
