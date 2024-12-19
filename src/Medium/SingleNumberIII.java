package Medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> uniqueMap = new HashMap<>();
        int index = 0;
        int[] output = new int[2];

        for(Integer el : nums) {
            uniqueMap.put(el, uniqueMap.getOrDefault(el, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> pair : uniqueMap.entrySet()) {
            if(pair.getValue() == 1) {
                output[index++] = pair.getKey();
            }
        }

        return output;
    }

}
