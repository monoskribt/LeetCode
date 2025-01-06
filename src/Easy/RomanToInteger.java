package Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i = s.length()-1; i>=0; i--) {
            int symbolValue = map.get(s.charAt(i));
            if(3 * symbolValue < sum) {
                sum -= symbolValue;
            }
            else {
                sum += symbolValue;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = romToInt("XIV");
        System.out.println(result);
    }
}
