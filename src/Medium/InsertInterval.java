package Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Interval {
    private Integer start;
    private Integer end;

    public Interval() {
    }

    public Interval(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        List<Interval> listInterval = new ArrayList<>();

        for (int[] interval : intervals) {
            listInterval.add(new Interval(interval[0], interval[1]));
        }

        Interval newIntervalObj = new Interval();
        newIntervalObj.setStart(newInterval[0]);
        newIntervalObj.setEnd(newInterval[1]);

        List<Interval> result = new ArrayList<>();
        int index = 0;

        while (index < listInterval.size()) {
            Interval currentInterval = listInterval.get(index);

            if (currentInterval.getEnd() < newIntervalObj.getStart()) {
                result.add(currentInterval);
            } else if (currentInterval.getStart() > newIntervalObj.getEnd()) {
                result.add(newIntervalObj);
                break;
            } else {
                newIntervalObj.setStart(Math.min(newIntervalObj.getStart(), currentInterval.getStart()));
                newIntervalObj.setEnd(Math.max(newIntervalObj.getEnd(), currentInterval.getEnd()));
            }
            index++;
        }

        while (index < listInterval.size()) {
            result.add(listInterval.get(index));
            index++;
        }

        if (!result.contains(newIntervalObj)) {
            result.add(newIntervalObj);
        }

        int[][] resultArray = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i][0] = result.get(i).getStart();
            resultArray[i][1] = result.get(i).getEnd();
        }

        return resultArray;
    }


    public static void main(String[] args) {
        InsertInterval solution = new InsertInterval();
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};

        int[][] result = solution.insert(intervals, newInterval);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

}
