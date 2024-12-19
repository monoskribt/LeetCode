package Easy;

import java.util.Arrays;

public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = nums[0];

        for(int i = 2; i < nums.length; i++) {
            if(i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        // 1, 2, 2, 5, 6, 6
        // (1, 2), (2, 5), (6, 6)
        // 1 + 2 + 6
        int[] nums1 = {6,2,6,5,1,2};

        // 1, 2, 3, 4
        // (1, 2), (3, 4)
        // 1 + 3
        int[] nums2 = {1,4,3,2};

        int result = arrayPairSum(nums2);
        System.out.println(result);
    }
}
