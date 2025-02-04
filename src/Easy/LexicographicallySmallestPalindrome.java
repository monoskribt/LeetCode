package Easy;

public class LexicographicallySmallestPalindrome {

    public String makeSmallestPalindrome(String s) {
        char[] sArray = s.toCharArray();

        int start = 0;
        int end = sArray.length - 1;

        while (start < end) {
            if(sArray[start] != sArray[end]) {
                char left = sArray[start];
                char right = sArray[end];

                if(left - 'a' < right - 'a') {
                    sArray[end] = left;
                } else {
                    sArray[start] = right;
                }
            }
            start++;
            end--;
        }

        return String.valueOf(sArray);
    }

}
