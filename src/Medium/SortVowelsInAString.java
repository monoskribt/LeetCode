package Medium;

import java.util.*;

public class SortVowelsInAString {

    private static final Set<Character> setOfVowelsMain = new HashSet<>(
            Arrays.asList('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'));

    public static String sortVowels(String s) {

        List<Character> listOfVowelsTemp = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (setOfVowelsMain.contains(c)) {
                listOfVowelsTemp.add(c);
            }
        }

        Collections.sort(listOfVowelsTemp);

        StringBuilder sb = new StringBuilder(s);
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (setOfVowelsMain.contains(c)) {
                sb.setCharAt(i, listOfVowelsTemp.get(index));
                index++;
            }
        }

        return sb.toString();
    }
}
