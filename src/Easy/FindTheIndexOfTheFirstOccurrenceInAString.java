package Easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";

        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
