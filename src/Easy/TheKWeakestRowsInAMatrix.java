package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> soldiersCount = new ArrayList<>();
        int[] result = new int[k];

        int row = mat.length;
        int col = mat[0].length;

        for(int i = 0; i < row; i++) {

            int left = 0;
            int right = col - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if(mat[i][mid] == 1) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            soldiersCount.add(new int[]{left, i});
        }

        soldiersCount.sort((a, b) ->
                a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        for(int i = 0; i < k; i++) {
            result[i] = soldiersCount.get(i)[1];
        }

        return result;
    }

}
