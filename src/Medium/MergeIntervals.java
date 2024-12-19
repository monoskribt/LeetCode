package Medium;


import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }

        List<Interval> listInterval = new ArrayList<>();

        for (int[] interval : intervals) {
            listInterval.add(new Interval(interval[0], interval[1]));
        }

        listInterval.sort(Comparator.comparing(Interval::getStart));

        Interval first = listInterval.getFirst();
        int start = first.getStart();
        int end = first.getEnd();

        List<Interval> result = new ArrayList<>();

        for(int i = 1; i < listInterval.size(); i++) {
            Interval current = listInterval.get(i);

            if(current.getStart() <= end) {
                end = Math.max(current.getEnd(), end);
            }
            else {
                result.add(new Interval(start, end));
                start = current.getStart();
                end = current.getEnd();
            }
        }

        result.add(new Interval(start, end));


        int[][] resultArray = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i][0] = result.get(i).getStart();
            resultArray[i][1] = result.get(i).getEnd();
        }

        return resultArray;
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

}
