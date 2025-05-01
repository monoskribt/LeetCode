package Medium;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cuurentList = new ArrayList<>();

        cuurentList.add(0);
        dfs(0, graph.length - 1, graph, cuurentList, result);
        return result;
    }

    private static void dfs(int source, int target, int[][] graph, List<Integer> current, List<List<Integer>> result) {
        if(source == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int neighbor : graph[source]) {
            current.add(neighbor);
            dfs(neighbor, target, graph, current, result);
            current.removeLast();
        }
    }
}
