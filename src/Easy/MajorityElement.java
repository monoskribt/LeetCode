package Easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();


        for(Integer el : nums) {
            if(map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            }
            else {
                map.put(el, 1);
            }
        }

        int element = map.entrySet().
                stream().
                max(Comparator.comparing(Map.Entry::getValue)).
                get().
                getKey();

        return element;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,3,1,1,4,1,1,5,1,1,6};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
