package Easy;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] usedNumbers = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), usedNumbers, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> current, boolean[] usedNumbers, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (usedNumbers[i]) continue;

            current.add(nums[i]);
            usedNumbers[i] = true;

            backtrack(nums, current, usedNumbers, result);

            current.removeLast();
            usedNumbers[i] = false;
        }
    }
}
