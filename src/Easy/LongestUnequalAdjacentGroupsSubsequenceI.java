package Easy;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int size = words.length;

        if(size == 0) {
            return List.of();
        }

        List<String> result = new ArrayList<>();

        int prevNumberGroup = groups[0];
        result.add(words[0]);


        for(int i = 1; i < size; i++) {
            if(groups[i] != prevNumberGroup) {
                result.add(words[i]);
                prevNumberGroup = groups[i];
            }
        }

        return result;


    }
}
