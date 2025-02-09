package Easy;

public class DIStringMatch {

    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];

        int max = s.length();
        int min = 0;

        if(!s.isEmpty()) {
            if(s.charAt(0) == 'D') {
                result[0] = max;
                max--;
            } else if(s.charAt(0) == 'I') {
                result[0] = min;
                min++;
            }
        }

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == 'D') {
                result[i] = max;
                max--;
            } else if(s.charAt(i) == 'I') {
                result[i] = min;
                min++;
            }
        }

        result[s.length()] = min;

        return result;
    }


    public static void main(String[] args) {
        int[] res = diStringMatch("IDID");
        System.out.println(res.toString());
    }

}
