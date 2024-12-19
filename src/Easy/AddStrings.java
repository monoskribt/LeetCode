package Easy;


import java.math.BigInteger;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sumOfStrings = 0;

        while (i>=0 || j>=0 || sumOfStrings > 0) {
            int sum = sumOfStrings;
            if(i>=0) {
                sum += num1.charAt(i--) - '0';
            }
            if(j>=0) {
                sum += num2.charAt(j--) - '0';
            }
            stringBuilder.append(sum % 10);
            sumOfStrings = sum / 10;
        }
        return stringBuilder.reverse().toString();
    }


    public static String addStringMyVersion(String num1, String num2) {

        BigInteger numbers1 = new BigInteger(num1);
        BigInteger numbers2 = new BigInteger(num2);

        BigInteger result = numbers1.add(numbers2);

        return String.valueOf(result);

    }



    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";

        String result = addStrings(num1, num2);
        System.out.println(result);
    }
}
