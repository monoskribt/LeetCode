package Easy;

public class MaximumOddBinaryNumber {

    public static String maximumOddBinaryNumber(String s) {
        int countOfOnes = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                countOfOnes++;
            }
        }

        int countOfZeros = s.length() - countOfOnes;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfOnes - 1; i++) {
            sb.append('1');
        }

        for (int i = 0; i < countOfZeros; i++) {
            sb.append('0');
        }

        sb.append('1');

        return sb.toString();
    }
}
