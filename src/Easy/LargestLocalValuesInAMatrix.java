package Easy;

public class LargestLocalValuesInAMatrix {

    public static int[][] largestLocal(int[][] grid) {
        int[][] outputGrid = new int[grid.length - 2][grid.length - 2];

        for(int row = 0; row < grid.length - 2; row++) {
            for(int col = 0; col < grid[0].length - 2; col++) {
                int maxValue = Integer.MIN_VALUE;

                for(int subRow = row; subRow < row + 3; subRow++) {
                    for(int subCol = col; subCol < col + 3; subCol++) {
                        maxValue = Math.max(maxValue, grid[subRow][subCol]);
                    }
                }
                outputGrid[row][col] = maxValue;
            }
        }

        return outputGrid;
    }
}
