package Medium;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        int current = 0;
        int result = 0;

        map.put(current,1);

        for(int num:nums){
            current += num % 2;
            result += map.getOrDefault(current - k,0);
            map.put(current, map.getOrDefault(current,0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[] {2,2,2,1,2,2,1,2,2,2};
        int kTest = 2;

        int result = numberOfSubarrays(test, kTest);
        System.out.println(result);
    }
}
