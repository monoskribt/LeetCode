package Easy;

import java.util.HashSet;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var left = 0;
        var dictionary = new HashSet<Integer>();

        for (var index = 0; index < nums.length; index++) {
            if (index - left > k) {
                dictionary.remove(nums[left]);
                left++;
            }

            if (dictionary.contains(nums[index])) {
                return true;
            }

            dictionary.add(nums[index]);
        }

        return false;
    }
}

