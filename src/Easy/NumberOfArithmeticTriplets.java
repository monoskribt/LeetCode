package Easy;

import java.util.HashMap;

public class NumberOfArithmeticTriplets {

    public static int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Integer> dictionary = new HashMap<>();
        int resultCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            dictionary.put(nums[i], i);
        }
        for (int el : nums) {
            if (dictionary.containsKey(el + diff) && dictionary.containsKey(el + 2 * diff)) {
                resultCounter++;
            }
        }
        return resultCounter;
    }
}
