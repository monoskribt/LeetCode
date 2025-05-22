package Easy.tryAfterAgain;

import java.util.ArrayList;
import java.util.List;

public class CountNumberOfMaximumBitwiseORSubsets {

    public int countMaxOrSubsets(int[] nums) {
        List<Integer> orResults = new ArrayList<>();
        orResults.add(0);

        for (int num : nums) {
            int size = orResults.size();
            for (int i = 0; i < size; i++) {
                int newOr = orResults.get(i) | num;
                orResults.add(newOr);
            }
        }

        int maxOr = 0;
        for (int or : orResults) {
            maxOr = Math.max(maxOr, or);
        }

        int count = 0;
        for (int or : orResults) {
            if (or == maxOr) {
                count++;
            }
        }

        return count;
    }
}
