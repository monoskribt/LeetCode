package Easy;

public class AntOnTheBoundary {
    public int returnToBoundaryCount(int[] nums) {
        int countOfStartPosition = 0;


        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == 0) {
                countOfStartPosition++;
            }
        }

        return countOfStartPosition;
    }
}
