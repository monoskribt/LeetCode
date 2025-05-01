package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindTheTownJudge {

    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n + 1];

        for(int[] edge : trust) {
            count[edge[0]]--;
            count[edge[1]]++;
        }

        for(int judge = 1; judge < count.length; judge++) {
            if(count[judge] == n - 1) {
                return judge;
            }
        }

        return -1;
    }

    private void dfs(int start, int[][] graph) {
        if(start == null)
    }
}
