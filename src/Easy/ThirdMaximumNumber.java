package Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        Arrays.sort(nums);
        int index = 1;

        for(int i = nums.length - 1; i >= 1; i--) {
            if(nums[i] != nums[i-1]) {
                index++;
            }
            if(index == 3) {
                return nums[i - 1];
            }
        }

        return -1;
    }

}
