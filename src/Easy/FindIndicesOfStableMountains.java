package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains {

    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> arr = new ArrayList<>();

        for (int i=1; i < height.length; i++) {
            if (height[i-1] > threshold) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 1};
        List<Integer> list = stableMountains(nums, 1);
        System.out.println(list);
    }

}
