package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringMatchingInAnArray {

    public static List<String> stringMatching(String[] words) {
        List<String> resultList = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(checkWordInList(words, words[i], i)) {
                resultList.add(words[i]);
            }
        }

        return resultList;
    }


    private static boolean checkWordInList(String[] words, String currentWord, int indexWord) {
        for(int j = 0; j < words.length; j++) {
            if(j == indexWord) {
                continue;
            }
            if(words[j].contains(currentWord)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> testList = stringMatching(words);
        System.out.println(testList);
    }

}
