package Medium;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        char[] arrOfS1 = s1.toCharArray();
        char[] arrOfS2 = s2.toCharArray();

        for (int i = 0; i <= arrOfS2.length - arrOfS1.length; i++) {
            if (helperFunction(i, arrOfS1, arrOfS2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean helperFunction(int startIndex, char[] arrOfS1, char[] arrOfS2) {
        int[] count = new int[26];

        for (char c : arrOfS1) {
            count[c - 'a']++;
        }

        for (int i = 0; i < arrOfS1.length; i++) {
            char currentChar = arrOfS2[startIndex + i];
            count[currentChar - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "ab";

        boolean test = checkInclusion(s1, s2);

        System.out.println(test);
    }
}
