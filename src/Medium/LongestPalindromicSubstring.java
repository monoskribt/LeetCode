package Medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] sCharArray = s.toCharArray();
        String outputWord = "";

        int holdIndex = 0;
        int maxLength = 0;

        while (holdIndex < sCharArray.length) {
            for (int i = holdIndex + 1; i < sCharArray.length; i++) {
                if (sCharArray[holdIndex] == sCharArray[i]) {
                    String candidate = s.substring(holdIndex, i + 1);

                    if(candidate.length() <= maxLength) {
                        continue;
                    }

                    if (isPalindrome(candidate)) {
                        outputWord = candidate;
                        maxLength = candidate.length();
                    }
                }
            }
            holdIndex++;
        }


        return outputWord.isEmpty() ? String.valueOf(s.charAt(0)) : outputWord;
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String result = longestPalindrome(s);
        System.out.println(result);


    }

}
