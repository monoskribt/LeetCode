package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFroSortedArray {
    public static int removeDuplicates(int[] nums) {
//        if(nums.length == 0) {
//            return 0;
//        }
//
//        int unique = 1;
//        for(int i=1; i<nums.length; i++) {
//            if(nums[i] != nums[i-1]) {
//                nums[unique] = nums[i];
//                unique++;
//            }
//        }
//        return unique;


        if(nums.length == 0) {
            return 0;
        }

        int[] uniqueElements = Arrays.stream(nums).distinct().toArray();

        for(int i=0; i<uniqueElements.length; i++) {
            nums[i] = uniqueElements[i];
        }
        return uniqueElements.length;
    }

    public static void main(String[] args) {
        int[] tab = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(tab);
        System.out.println(result);
    }
}
