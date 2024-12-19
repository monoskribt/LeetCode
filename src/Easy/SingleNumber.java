package Easy;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {


        int[] nums = {4,1,2,1,2};
        int result = singleNumber(nums);

        System.out.println(result);
    }
}
