package Easy;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if(s.isEmpty() || t.isEmpty()) {
            return false;
        }

        int expectCount = s.length();
        int mainPointer = 0;


        for(int i = 0; i < t.length(); i++) {
            if(s.charAt(mainPointer) == t.charAt(i)) {
                mainPointer++;
            }

            if(mainPointer == expectCount) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }

}
