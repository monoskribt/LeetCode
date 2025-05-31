package Easy;


public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        int[] dictionary = new int[26];

        for(int i = 0; i < allowed.length(); i++) {
            dictionary[allowed.charAt(i) - 'a']++;
        }

        for(String word : words) {
            boolean isExist = true;
            for(int i = 0; i < word.length(); i++) {
                if(dictionary[word.charAt(i) - 'a'] == 0) {
                    isExist = false;
                    break;
                }
            }

            if(isExist) {
                result++;
            }
        }

        return result;
    }
}
