package Medium;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] incoming = new boolean[n];

        for(List<Integer> edge : edges) {
            int current = edge.get(1);
            if(!incoming[current]) {
                incoming[current] = true;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(!incoming[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
