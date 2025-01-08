package Medium;

public class NumberOfWaysToSplitArray {

    public static int waysToSplitArray(int[] nums) {
        int currentValue = 0;
        int totalSum = 0;
        int count = 0;

        for(int el : nums) {
            totalSum += el;
        }

        for(int i = 0; i < nums.length - 1; i++) {
            currentValue += nums[i];

            if(currentValue >= totalSum - currentValue) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[] arrNums = {10,4,-8,7};

        int result = waysToSplitArray(arrNums);
        System.out.println(result);
    }

}
