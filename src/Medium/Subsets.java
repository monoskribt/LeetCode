package Medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();

        getSubset(result, currentSubset, nums, 0);
        return result;
    }

    private static void getSubset(List<List<Integer>> result, List<Integer> currentSubset, int[] nums, int index) {
        if(index == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        currentSubset.add(nums[index]);
        getSubset(result, currentSubset, nums, index + 1);

        currentSubset.removeLast();
        getSubset(result, currentSubset, nums, index + 1);
    }
}
