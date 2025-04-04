package Medium;

public class MatrixBlockSum {

    public int[][] matrixBlockSum(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int sum = 0;

                for (int r = Math.max(0, i - k); r <= Math.min(row - 1, i + k); r++) {
                    for (int c = Math.max(0, j - k); c <= Math.min(col - 1, j + k); c++) {
                        sum += mat[r][c];
                    }
                }

                ans[i][j] = sum;
            }
        }

        return ans;
    }
}
