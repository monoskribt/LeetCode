package Medium;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseWordsInAString {

    public static String reverseWords(String s) {
        if(s.isEmpty()) {
            return "";
        }

        s = s.trim();

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();


        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                sb.append(arr[i]);
                if(i != 0) {
                    sb.append(" ");
                }
            }
        }


        return sb.toString();
    }


    public static void main(String[] args) {
        String word = "a good   example";
        System.out.println(reverseWords(word));
    }

}
