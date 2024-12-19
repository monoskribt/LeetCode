package Medium;

public class SingleElementInASortedArray {

    public static int singleNonDuplicate(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if(nums[start] != nums[start + 1]) {
                return nums[start];
            }
            else if(nums[end] != nums[end - 1]) {
                return nums[end];
            }
            else {
                start+=2;
                end-=2;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        int result = singleNonDuplicate(nums);
        System.out.println(result);
    }
}
