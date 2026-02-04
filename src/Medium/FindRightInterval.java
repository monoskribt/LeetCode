package Medium;

import java.util.TreeMap;

public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        var treeMap = new TreeMap<Integer, Integer>();
        var result = new int[intervals.length];

        for (var i = 0; i < intervals.length; i++) {
            treeMap.put(intervals[i][0], i);
        }

        for (var i = 0; i < intervals.length; i++) {
            var index = treeMap.ceilingKey(intervals[i][1]);
            result[i] = index == null ? -1 : treeMap.get(index);
        }

        return result;
    }
}
