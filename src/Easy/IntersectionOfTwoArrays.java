package Easy;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        for(int el : nums1) {
            list1.add(el);
        }

        Set<Integer> resultList = new HashSet<>();
        for(int el : nums2) {
            if(list1.contains(el)) {
                resultList.add(el);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();

    }


    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] result = intersection(nums1, nums2);

        for(int el : result) {
            System.out.print(el + " ");
        }

    }
}
