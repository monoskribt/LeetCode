package Medium;

public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = x < 0;

        if(isNegative) {
            x = x * - 1;
        }

        long reversedNumber = 0;
        int lastDigit;

        while (x > 0) {
            lastDigit = x % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            x = x / 10;
        }

        return (int) (isNegative ? reversedNumber * -1 : reversedNumber);
    }
}
