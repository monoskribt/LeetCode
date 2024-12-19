package Medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {

    public int singleNumber(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> uniqueMap = new HashMap<>();

        for(Integer el : nums) {
            uniqueMap.put(el, uniqueMap.getOrDefault(el, 0) + 1);
        }

        int myUniqueValue = 0;

        for(Map.Entry<Integer, Integer> pair: uniqueMap.entrySet()) {
            if(pair.getValue() == 1) {
                myUniqueValue = pair.getKey();
                break;
            }
        }

        return myUniqueValue;
    }

}
