package Easy;

public class NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        if(s == null || s.trim().isEmpty()) {
            return 0;
        }

        s = s.trim();

        String[] arrS = s.trim().split("\\s+");

        return arrS.length;
    }


    public static void main(String[] args) {
        int result = countSegments("                ");
        System.out.println(result);
    }
}
