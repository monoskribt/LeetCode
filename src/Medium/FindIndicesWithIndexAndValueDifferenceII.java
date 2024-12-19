package Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class FindIndicesWithIndexAndValueDifferenceII {

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;


        for (int i = indexDifference; i < n; i++){
            if (nums[i - indexDifference] < nums[minIndex]) {
                minIndex = i - indexDifference;
            }
            if (nums[i - indexDifference] > nums[maxIndex]) {
                maxIndex = i - indexDifference;
            }


            if (Math.abs(nums[i] - nums[minIndex]) >= valueDifference) {
                return new int[]{i, minIndex};
            }
            if (Math.abs(nums[i] - nums[maxIndex]) >= valueDifference) {
                return new int[]{i, maxIndex};
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] nums = {7, 1, 4, 10, 12, 3, 6};
        int indexDifference = 3;
        int valueDifference = 7;

        int[] result = findIndices(nums, indexDifference, valueDifference);
    }

}
