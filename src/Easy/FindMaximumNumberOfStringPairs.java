package Easy;

import java.util.*;

public class FindMaximumNumberOfStringPairs {

    public static int maximumNumberOfStringPairs(String[] words) {
        int counter = 0;

        for(int i = 0; i < words.length; i++) {
            String currentWordI = words[i];
            for(int j = i + 1; j < words.length; j++) {
                if(isReversed(currentWordI, words[j])) {
                    counter++;
                }
            }
        }

        return counter;
    }

    private static boolean isReversed(String original, String toReverse) {
        int left = 0;
        int right = toReverse.length() - 1;

        while (left < original.length()) {
            if (original.charAt(left) != toReverse.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        String[] test = {"cd","ac","dc","ca","zz"};
        int result = maximumNumberOfStringPairs(test);

        System.out.println(result);
    }
}
