package Medium;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
    public static int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        List<Character> list = new ArrayList<>();

        int currentCounterSymbol = 1;
        char current = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (current == chars[i]) {
                currentCounterSymbol++;
            } else {
                list.add(current);
                if (currentCounterSymbol > 1) {
                    for (char c : String.valueOf(currentCounterSymbol).toCharArray()) {
                        list.add(c);
                    }
                }
                current = chars[i];
                currentCounterSymbol = 1;
            }
        }

        list.add(current);
        if (currentCounterSymbol > 1) {
            for (char c : String.valueOf(currentCounterSymbol).toCharArray()) {
                list.add(c);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }

        return list.size();
    }

    public static void main(String[] args) {
        char[] charsArray = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',};
        int result = compress(charsArray);

        System.out.println(result);
    }
}
