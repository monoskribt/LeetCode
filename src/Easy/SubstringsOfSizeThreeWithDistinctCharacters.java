package Easy;

import java.util.HashSet;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static int countGoodSubstrings(String s) {
        if(s.length() < 3) {
            return 0;
        }

        int result = 0;

        for(int i = 0; i <= s.length() - 3; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            char third = s.charAt(i + 2);

            if(first != second && first != third && second != third) {
                result++;
            }
        }

        return result;
    }
}
