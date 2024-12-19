package Easy;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumberMyAnswer(int[] nums) {
        int left = 0;
        int length = nums.length;

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == left) {
                left++;
            }
            else if (nums[i] != left) {
                return i;
            }

        }
        return length;
    }

    public static int missingNumberBetterAnswer(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }

        for (int num : nums) {
            sum -= num;
        }

        return sum;
    }



    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int result = missingNumberMyAnswer(nums);
        System.out.println(result);
    }
}
