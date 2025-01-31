package Easy;

import java.util.Arrays;

public class RowWithMaximumOnes {

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];

        int row = mat.length;
        int col = mat[0].length;

        int maxRow = Integer.MIN_VALUE;
        int maxCounter = 0;

        for(int i = 0; i < row; i++) {
            int currentCounter = 0;
            for(int j = 0; j < col; j++) {
                if(mat[i][j] == 1) {
                    currentCounter++;
                }
            }
            if(maxCounter < currentCounter) {
                maxCounter = currentCounter;
                maxRow = i;
            }
        }
        result[0] = maxRow;
        result[1] = maxCounter;
        return result;
    }
}
