package Easy.tryAfterAgain;

public class ReshapeTheMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rowsLength = mat.length;
        int colsLength = mat[0].length;

        if (rowsLength * colsLength != r * c) {
            return mat;
        }

        int[][] reshapeMatrix = new int[r][c];
        int indexRow = 0;
        int indexCol = 0;

        for (int i = 0; i < rowsLength; i++) {
            for (int j = 0; j < colsLength; j++) {
                reshapeMatrix[indexRow][indexCol] = mat[i][j];
                indexCol++;

                if (indexCol == c) {
                    indexCol = 0;
                    indexRow++;
                }
            }
        }

        return reshapeMatrix;
    }



    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,2}, {3, 4}};

        int[][] result = matrixReshape(nums, 1, 4);
    }
}
