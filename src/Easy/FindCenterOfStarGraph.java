package Easy;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {
    private final Map<Integer, Integer> map = new HashMap<>();

    public int findCenter(int[][] edges) {
        for (int[] edge : edges) {
            for (int j = 0; j < edges[0].length; j++) {
                int current = edge[j];
                if (map.containsKey(current)) {
                    return current;
                }
                map.put(current, map.getOrDefault(current, 0) + 1);
            }
        }

        return -1;
    }
}
