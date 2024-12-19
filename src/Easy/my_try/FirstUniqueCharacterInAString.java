package Easy.my_try;

import java.util.HashMap;


public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map= new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String s = "loveleetcode";
        int result = firstUniqChar(s);
        System.out.println(result);
    }
}
