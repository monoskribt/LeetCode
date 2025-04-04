package Medium;

public class FindTheScoreOfAllPrefixesOfAnArray {

    public long[] findPrefixScore(int[] nums) {
        int sizeOfNums = nums.length;
        long[] resultArray = new long[sizeOfNums];

        long max = Integer.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i < sizeOfNums; i++) {
            long currentValue = nums[i];
            max = Math.max(currentValue, max);

            sum += currentValue + max;
            resultArray[i] = sum;
        }

        return resultArray;
    }
}
