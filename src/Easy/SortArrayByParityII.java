package Easy;

import java.util.Arrays;

public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] nums) {
        int length = nums.length;

        int[] resultArray = new int[length];

        int evenIndex = 0;
        int oddIndex = 1;

        for(int el : nums) {
            if(el % 2 == 0) {
                resultArray[evenIndex] = el;
                evenIndex += 2;
            } else {
                resultArray[oddIndex] = el;
                oddIndex += 2;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] test = new int[] {4,2,5,7};
        int[] result = sortArrayByParityII(test);
        System.out.println(Arrays.toString(result));
    }
}
