package Easy;

import java.util.Arrays;

public class MinimumNumberGame {

    public static int[] numberGame(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);

        if(length >= 2) {
            for(int i = 0; i < length; i+=2) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        return nums;
    }
}
