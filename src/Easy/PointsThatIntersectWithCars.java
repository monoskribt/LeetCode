package Easy;

import java.util.*;

public class PointsThatIntersectWithCars {
    public static int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set = new HashSet<>();

        for (List<Integer> currentList : nums) {

            int from = currentList.getFirst();
            int to = currentList.getLast();

            for (int j = from; j <= to; j++) {
                set.add(j);
            }
        }

        return set.size();
    }
}
