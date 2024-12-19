package Medium;

import java.util.*;

public class MaximumProductOfWordLengths {

    public static int maxProduct(String[] words) {

        List<HashSet<Character>> setChar = new ArrayList<>();

        for(String word : words) {
            HashSet<Character> set = new HashSet<>();
            for(char el : word.toCharArray()) {
                set.add(el);
            }
            setChar.add(set);
        }

        int maxSum = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                HashSet<Character> set1 = setChar.get(i);
                HashSet<Character> set2 = setChar.get(j);

                boolean duplicateIs = false;

                for(char c : set1) {
                    if(set2.contains(c)) {
                        duplicateIs = true;
                        break;
                    }
                }

                if(!duplicateIs) {
                    maxSum = Math.max(maxSum, words[i].length() * words[j].length());
                }
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        String[] word = {"a","ab","abc","d","cd","bcd","abcd"};
        int res = maxProduct(word);
        System.out.println(res);
    }

}
