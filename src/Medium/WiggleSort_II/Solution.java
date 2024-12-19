package Medium.WiggleSort_II;

import java.util.Arrays;

public class Solution {

    public static void wiggleSort(int[] nums) {
        int[] cloneNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            cloneNums[i] = nums[i];
        }
        Arrays.sort(cloneNums);

        int mid = (cloneNums.length - 1) / 2;
        int last = cloneNums.length - 1;

        for(int i = 0; i < cloneNums.length; i++) {
            if(i % 2 == 0) {
                nums[i] = cloneNums[mid];
                mid--;
            }
            else {
                nums[i] = cloneNums[last];
                last--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[] {1,5,1,1,6,4};
        wiggleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
