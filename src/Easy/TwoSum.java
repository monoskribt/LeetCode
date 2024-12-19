package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            }
            else {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }
        }
        return result;
    }



    public static int[] twoSumSecondOption(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                result[0] = nums[left];
                result[1] = nums[right];
                return result;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[0];

    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] twoSum = twoSumSecondOption(nums, 6);
        System.out.println(Arrays.toString(twoSum));
    }
}
