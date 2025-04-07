package Easy;

public class CountSubstringsThatSatisfyK_ConstraintI {
    public static int countKConstraintSubstrings(String s, int k) {
        int size = s.length();
        int answer = 0;

        for(int i = 0; i < size; i++) {
            int zero = 0;
            int ones = 0;

            for(int j = i; j < size; j++) {
                if(s.charAt(j) == '0') {
                    zero++;
                }
                else {
                    ones++;
                }

                if(zero <= k || ones <= k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
