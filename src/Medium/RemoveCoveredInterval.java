package Medium;

public class RemoveCoveredInterval {
    public int removeCoveredIntervals(int[][] intervals) {
        var removed = 0;
        var maxEnd = 0;
        var length = intervals.length;

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return b[1] - a[1];
        });

        for (var i = 0; i < length; i++) {
            var end = intervals[i][1];

            if (end <= maxEnd) {
                removed++;
            }
            else {
                maxEnd = end;
            }
        }

        return length - removed;
    }
}
