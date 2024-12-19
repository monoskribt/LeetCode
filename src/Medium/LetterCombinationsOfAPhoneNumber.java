package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) {
            return new ArrayList<>();
        }

        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        result.add("");

        for (char el : digits.toCharArray()) {

            String letters = map.get(el);

            List<String> temp = new ArrayList<>();

            for(String comb : result) {
                for(char letter : letters.toCharArray()) {
                    temp.add(comb + letter);
                }
            }

            result = temp;

        }

        return result;
    }


    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }

}
