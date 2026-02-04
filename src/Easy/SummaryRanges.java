package Easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        var result = new ArrayList<String>();

        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int prev = 0;

        for (int index = 1; index < nums.length; index++) {

            if (nums[index] != nums[prev] + 1) {

                if (start == nums[prev]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[prev]);
                }

                start = nums[index];
            }

            prev = index;
        }

        if (start == nums[prev]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[prev]);
        }

        return result;
    }
}

