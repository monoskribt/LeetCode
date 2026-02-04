package Medium;

import java.util.HashSet;

public class MaximumSumOfDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        var left = 0;
        var windowSum = 0;
        var maxSum = 0;

        var repeated = new HashSet<Integer>();

        for (var right = 0; right < nums.length; right++) {
            while (repeated.contains(nums[right])) {
                repeated.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            repeated.add(nums[right]);
            windowSum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                repeated.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
