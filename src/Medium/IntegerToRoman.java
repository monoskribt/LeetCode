package Medium;

public class IntegerToRoman {

    public String intToRoman(int num) {
        String output = "";
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0; i < 13; i++) {
            while (num >= values[i]) {
                output += symbols[i];
                num -= values[i];
            }
        }

        return output;
    }

}
