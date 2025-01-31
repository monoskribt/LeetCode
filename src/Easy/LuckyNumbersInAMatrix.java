package Easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] minRowValues = new int[row];
        int[] maxColValues = new int[col];

        for (int i = 0; i < row; i++) {
            int minRowValue = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                minRowValue = Math.min(minRowValue, matrix[i][j]);
            }
            minRowValues[i] = minRowValue;
        }

        for (int j = 0; j < col; j++) {
            int maxColValue = Integer.MIN_VALUE;
            for (int i = 0; i < row; i++) {
                maxColValue = Math.max(maxColValue, matrix[i][j]);
            }
            maxColValues[j] = maxColValue;
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == minRowValues[i] && matrix[i][j] == maxColValues[j]) {
                    resultList.add(matrix[i][j]);
                }
            }
        }

        return resultList;
    }

}
