package Easy;

import java.math.BigInteger;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        StringBuilder sbDigit = new StringBuilder();

        for (int el : digits) {
            sbDigit.append(el);
        }

        BigInteger bigInt = new BigInteger(sbDigit.toString());
        bigInt = bigInt.add(BigInteger.ONE);

        String tempDigit = bigInt.toString();
        int[] tabDigits = new int[tempDigit.length()];
        for (int i = 0; i < tempDigit.length(); i++) {
            tabDigits[i] = tempDigit.charAt(i) - '0';
        }

        return tabDigits;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 7};
        int[] result = plusOne(arr);

        for(int el : result) {
            System.out.print(el + " ");
        }
    }
}
