package Easy;

import java.util.Arrays;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        char[] wordToArr = word.toCharArray();

        for(int i = 0; i < wordToArr.length; i++) {
            if(wordToArr[i] == ch) {

                int start = 0;
                int end = i;

                while (start < end) {
                    char temp = wordToArr[start];
                    wordToArr[start] = wordToArr[end];
                    wordToArr[end] = temp;
                    start++;
                    end--;
                }
                break;
            }
        }
        return String.valueOf(wordToArr);
    }

}
