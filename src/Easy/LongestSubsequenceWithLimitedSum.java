package Easy;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        for(int i = 0; i < queries.length; i++) {
            queries[i] = binarySearch(nums, queries[i]);
        }

        return queries;
    }


    private static int binarySearch(int[] nums, int value) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while (left <= right) {
            int pivot = (left + right) / 2;

            if(nums[pivot] <= value) {
                result = pivot + 1;
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {4,5,2,1};
        int[] quer = new int[] {3,10,21};

        int[] test = answerQueries(nums, quer);
        System.out.println(Arrays.toString(test));
    }

}
