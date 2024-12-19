package Medium.BinarySearch;

public class Solution {

    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while(first <= last) {
            int mid = (first + last) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(target < nums[mid]) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }

        return -1;
    }

}
