package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SumOfAllSubsetXORTotals {

    public static int subsetXORSum(int[] nums) {
        List<Integer> xorTotals = new ArrayList<>();
        xorTotals.add(0);

        for (int num : nums) {
            int size = xorTotals.size();
            for (int i = 0; i < size; i++) {
                int newXor = xorTotals.get(i) ^ num;
                xorTotals.add(newXor);
            }
        }

        int sum = 0;
        for (int total : xorTotals) {
            sum += total;
        }
        return sum;
    }
}
