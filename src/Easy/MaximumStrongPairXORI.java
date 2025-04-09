package Easy;

public class MaximumStrongPairXORI {

    public int maximumStrongPairXor(int[] nums) {
        int result = 0;
        int length = nums.length;

        for(int i = 0; i < length; i++) {
            int currentI = nums[i];

            for(int j = i; j < length; j++) {
                int currentJ = nums[j];
                boolean checkCondition = Math.abs(currentI - currentJ) <= Math.min(currentI, currentJ);

                if(checkCondition) {
                    result = Math.max(currentI ^ currentJ, result);
                }
                else {
                    break;
                }
            }
        }

        return result;
    }
}
