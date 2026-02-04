package Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        var left = 0;
        var result = 0;

        for (var index = 0; index < nums.length; index++) {
            if (nums[index] == 0) {
                left = index + 1;
            } else {
                result = Math.max(result, index - left + 1);
            }
        }

        return result;
    }
}
