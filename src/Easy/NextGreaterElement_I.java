package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement_I {


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length - 1; i>=0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());

            stack.push(nums2[i]);
        }


        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;

    }




    // My Example
//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] resultArr = new int[nums1.length];
//
//        for(int i=0; i<nums1.length; i++) {
//            for(int j=0; j<nums2.length; j++) {
//                if(nums1[i] == nums2[j]) {
//                    int result = helperFunction(nums2, nums2[j], j);
//                    resultArr[i] = result;
//                }
//            }
//        }
//
//        return resultArr;
//
//    }
//
//
//    public static int helperFunction(int[] arr, int value, int index) {
//        for(int start = index; start<arr.length; start++) {
//            if(arr[start] > value) {
//                return arr[start];
//            }
//        }
//        return -1;
//    }


    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
