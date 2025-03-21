package Easy;


import java.util.*;

public class FindX_SumOfAllK_LongSubarraysI {

    public int[] findXSum(int[] nums, int k, int x) {
        int left = 0;
        int right = k - 1;

        int[] output = new int[nums.length - k + 1];
        int outputIndex = 0;

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) ->
                (map.get(b).equals(map.get(a)) ? b - a : map.get(b) - map.get(a)));

        while (right < nums.length) {
            map.clear();
            priorityQueue.clear();

            for(int i = left; i <= right; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
                priorityQueue.offer(entry.getKey());
            }

            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < x && !priorityQueue.isEmpty(); i++) {
                set.add(priorityQueue.poll());
            }

            int sum = 0;
            for(int i = left; i <= right; i++) {
                if(set.contains(nums[i])) {
                    sum += nums[i];
                }
            }

            output[outputIndex++] = sum;
            left++;
            right++;
        }

        return output;
    }


}
