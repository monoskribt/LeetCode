package Easy;

public class ReverseStringII {

    public static String reverseStr(String s, int k) {
        if(s.isEmpty() || k == 0) {
            return "";
        }

        char[] arrString = s.toCharArray();

        for(int i = 0; i < s.length(); i += 2 * k) {

            int start = i;
            int end = Math.min(i + k - 1, s.length() - 1);

            while (start < end) {
                char temp = arrString[start];
                arrString[start] = arrString[end];
                arrString[end] = temp;

                start++;
                end--;
            }
        }

        return String.valueOf(arrString);
    }

    public static void main(String[] args) {
        String word = "abcdefghijklmno";
        int k = 3;

        System.out.println(reverseStr(word, k));
    }

}
