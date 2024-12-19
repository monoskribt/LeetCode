package Easy;

import java.util.Arrays;

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int pointer = 0;

        if(s.isEmpty()) {
            return tArray[pointer];
        }

        for (char c : tArray) {
            if (pointer < sArray.length && c != sArray[pointer]) {
                return c;
            } else if (pointer < sArray.length) {
                pointer++;
            }
        }

        return tArray[tArray.length - 1];
    }


    public static void main(String[] args) {
        String s = "apple";
        String t = "applex";

        char result = findTheDifference(s, t);
        System.out.println(result);
    }

}
