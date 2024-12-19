package Easy;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static boolean isPalindromeMySolve(String s) {
        if(s == null) {
            return true;
        }
        s = s.toLowerCase().trim();

        List<Character> characterList = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                characterList.add(s.charAt(i));
            }
        }


        char[] characterListReversed = new char[characterList.size()];

        int left = 0;
        for(int i = characterList.size() - 1; i>=0; i--) {
            characterListReversed[left] = characterList.get(i);
            left++;
        }


        for(int i = 0; i < characterListReversed.length; i++) {
            if(characterList.get(i) != characterListReversed[i]) {
                return false;
            }
        }

        return true;
    }



    public static boolean isPalindromeChatGptSolve(String s) {
        if (s == null) {
            return true;
        }

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right && s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindromeMySolve("A man, a plan, a canal: Panama"));
    }
}
