package Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < 720; i++) {
            int hour = i / 60;
            int minute = i % 60;

            if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                result.add(String.format("%d:%02d", hour, minute));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> res = readBinaryWatch(1);
        System.out.println(res);
    }
}
