package Easy;

import java.util.*;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int el : nums) {
            if(map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            }
            else {
                map.put(el, 1);
            }
        }

        int sum = 0;

        for (Map.Entry<Integer, Integer> el : map.entrySet()) {
            if (el.getValue() == 1) {
                sum += el.getKey();
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int result = sumOfUnique(nums);
        System.out.println(result);
    }
}
