package Easy;

import java.util.Arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums2 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums2, 2)); // Ожидаемый результат: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println(searchInsert(nums3, 7)); // Ожидаемый результат: 4
    }
}
