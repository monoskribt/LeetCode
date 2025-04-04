package Easy;

public class AntOnTheBoundary {
    public int returnToBoundaryCount(int[] nums) {
        int countOfStartPosition = 0;


        int sum = 0;
        for (int num : nums) {
            sum += num;

            if (sum == 0) {
                countOfStartPosition++;
            }
        }

        return countOfStartPosition;
    }
}
