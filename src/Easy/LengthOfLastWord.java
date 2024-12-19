package Easy;

import java.util.*;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] tab = s.split("\s");

        Deque<String> deque = new ArrayDeque<>(Arrays.asList(tab));
        return deque.getLast().length();
    }

    public static void main(String[] args) {

    }
}
