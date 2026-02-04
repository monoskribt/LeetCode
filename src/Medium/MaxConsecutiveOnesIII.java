package Medium;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeros = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeros++;
            }

            if (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        var test = new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        var result = longestOnes(test, 3);
        System.out.println(result);
    }
}
