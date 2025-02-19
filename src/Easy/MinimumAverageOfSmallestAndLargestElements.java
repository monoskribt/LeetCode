package Easy;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements {

    public static double minimumAverage(int[] nums) {
        double minAverage = 0.0;
        double prevMinAverage = Double.MAX_VALUE;

        int start = 0;
        int end = nums.length - 1;

        Arrays.sort(nums);

        while (start <= end) {
            minAverage = (double) (nums[start] + nums[end]) / 2;

            minAverage = Math.min(minAverage, prevMinAverage);
            prevMinAverage = minAverage;

            start++;
            end--;
        }

        return minAverage;
    }
}
