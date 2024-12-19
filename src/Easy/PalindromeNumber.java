package Easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int tempX = x;
        int reversed = 0;


        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return Integer.compare(tempX, reversed) == 0;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(121);
        System.out.println(result);
    }
}
