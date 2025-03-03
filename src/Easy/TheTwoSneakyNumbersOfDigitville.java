package Easy;

import java.util.*;
import java.util.stream.Collectors;

public class TheTwoSneakyNumbersOfDigitville {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int index = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    result[index] = nums[i];
                    index++;
                    break;
                }
            }
        }

        return result;
    }

}
