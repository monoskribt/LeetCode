package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counterNumbers = new HashMap<>();
        for(Integer element : nums) {
            if(counterNumbers.containsKey(element)) {
                counterNumbers.put(element, counterNumbers.get(element) + 1);
            }
            else {
                counterNumbers.put(element, 1);
            }
        }

        Integer[] numsArray = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(numsArray, (a, b) -> {
            int counterNumberA = counterNumbers.get(a);
            int counterNumberB = counterNumbers.get(b);

            if(counterNumberA != counterNumberB) {
                return Integer.compare(counterNumberA, counterNumberB);
            }
            else {
                return Integer.compare(b, a);
            }
        });

        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {24, 24, 24, 32, 32, 32, 37};
        int[] sortedNums = frequencySort(nums);
        System.out.println(Arrays.toString(sortedNums));
    }
}
