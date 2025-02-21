package Easy;

public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;

        for(Integer el : nums) {
            if(el > firstMax) {
                secondMax = firstMax;
                firstMax = el;
            } else if(el > secondMax) {
                secondMax = el;
            }
        }

        return (firstMax - 1) * (secondMax -1);
    }

    public static void main(String[] args) {
        int[] test = new int[] {1,8,5,4,10,2,6,1,1,1,9};

        MaximumProductOfTwoElementsInAnArray testMethod = new MaximumProductOfTwoElementsInAnArray();
        int result = testMethod.maxProduct(test);
        System.out.println(result);

    }

}
