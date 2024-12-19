package Easy;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        String newS = s.trim();
        String newT = t.trim();

        char[] tabS = newS.toCharArray();
        char[] tabT = newT.toCharArray();

        Arrays.sort(tabS);
        Arrays.sort(tabT);

        return Arrays.equals(tabS, tabT);
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
