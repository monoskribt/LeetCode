package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        if(rowIndex == 0) {
            return result.getFirst();
        }

        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> prevList = result.get(i - 1);
            List<Integer> currentList = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    currentList.add(1);
                }
                else {
                    currentList.add(prevList.get(j - 1) + prevList.get(j));
                }
            }

            result.add(currentList);
        }

        return result.get(rowIndex);
    }
}
