package Easy.my_try;

import java.util.*;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> list = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(Integer el : nums1) {
            list.add(el);
        }

        for(Integer el : nums2) {
            if(list.contains(el)) {
                result.add(el);
                list.remove(el);
            }
        }

        int[] output = new int[result.size()];
        int index = 0;
        for(Integer el : result) {
            output[index] = el;
            index++;
        }

        return output;
    }

}
