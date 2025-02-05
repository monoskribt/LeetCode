package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {

        Map<Character, Integer> dictionary = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        char[] sArray = s.toCharArray();

        for(int i = 0; i < sArray.length; i++) {
            dictionary.put(sArray[i], i);
        }

        int currentMaxLength = 0;
        int previousIndex = 0;

        for(int i = 0; i < sArray.length; i++) {
            currentMaxLength = Math.max(currentMaxLength, dictionary.get(sArray[i]));

            if(currentMaxLength == i) {
                result.add(i - previousIndex + 1);
                previousIndex = i + 1;
            }
        }
        return result;
    }

}
