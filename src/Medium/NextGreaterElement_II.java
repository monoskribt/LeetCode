package Medium;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_II {

    public static int[] nextGreaterElements(int[] nums) {
        int[] output = new int[nums.length];
        int length = output.length;

        Stack<Integer> stack = new Stack<>();

        for(int i = 2 * length - 1; i>=0; i--) {
            int index = i % length;

            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                output[index] = -1;
            }
            else {
                output[index] = stack.peek();
            }
            stack.push(nums[index]);
        }
        return output;
    }




    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,3};

        int[] result = nextGreaterElements(nums1);

        System.out.println(Arrays.toString(result));
    }
}
