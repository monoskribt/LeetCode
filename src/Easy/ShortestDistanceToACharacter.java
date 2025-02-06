package Easy;


public class ShortestDistanceToACharacter {

    public static int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[length];
        int previous = -length;

        for(int i = 0; i < length; i++) {
            if(s.charAt(i) == c) {
                previous = i;
            }
            result[i] = Math.abs(previous - i);
        }

        previous = 2 * length;

        for(int j = length - 1; j >= 0; j--) {
            if(s.charAt(j) == c) {
                previous = j;
            }
            result[j] = Math.min(result[j], Math.abs(previous - j));
        }

        return result;
    }

    public static void main(String[] args) {
        String word = "loveleetcode";
        int[] test = shortestToChar(word, 'e');

        for (int num : test) {
            System.out.print(num + " ");
        }
    }
}
