package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindWordsContainingCharacter {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> output = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            char[] wordArr = words[i].toCharArray();
            for (char c : wordArr) {
                if (c == x) {
                    output.add(i);
                    break;
                }
            }
        }

        return output;
    }

}
