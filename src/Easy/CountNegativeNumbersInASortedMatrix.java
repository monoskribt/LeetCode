package Easy;

public class CountNegativeNumbersInASortedMatrix {

    public static int countNegatives(int[][] grid) {
        int result = 0;
        int countNegative = 0;

        int col = grid[0].length;

        for (int[] rowEl : grid) {
            int left = 0;
            int right = col - 1;

            while (left <= right) {
                int pivot = left + (right - left) / 2;

                if (rowEl[pivot] < 0) {
                    countNegative = col - pivot;
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
            result += countNegative;
        }

        return result;
    }
}
