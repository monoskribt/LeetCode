package Medium;

public class DesignNeighborSumService {

    private final int[][] grid;

    public DesignNeighborSumService(int[][] grid) {
        this.grid = grid;
    }

    public int adjacentSum(int value) {
        int row = grid.length;
        int col = grid[0].length;

        int sumValue = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == value) {
                    if(j != 0) {
                        sumValue += grid[i][j-1];
                    }
                    if(i != 0) {
                        sumValue += grid[i-1][j];
                    }
                    if(j != col - 1) {
                        sumValue += grid[i][j+1];
                    }
                    if(i != row - 1) {
                        sumValue += grid[i+1][j];
                    }
                }
            }
        }
        return sumValue;
    }

    public int diagonalSum(int value) {
        int row = grid.length;
        int col = grid[0].length;

        int sumValue = 0;

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == value) {
                    if (i != 0 && j != 0) {
                        sumValue += grid[i-1][j-1];
                    }
                    if (i != 0 && j != col - 1) {
                        sumValue += grid[i-1][j+1];
                    }
                    if (i != row - 1 && j != 0) {
                        sumValue += grid[i+1][j-1];
                    }
                    if (i != row - 1 && j != col - 1) {
                        sumValue += grid[i+1][j+1];
                    }
                }
            }
        }
        return sumValue;
    }


}
