package TryAgainSoon;

import java.util.Arrays;

public class MagneticForceBetweenTwoBalls {

    public static int maxDistance(int[] position, int m) {
        int result = 0;
        int length = position.length;

        Arrays.sort(position);

        int left = 1;
        int right = position[length - 1] - position[0];

        while (left <= right) {
            int pivot = (right + left) / 2;

            if(placeOfBallsHelper(position, pivot, m)) {
                result = pivot;
                left = pivot + 1;
            }
            else {
                right = pivot - 1;
            }
        }

        return result;
    }


    private static boolean placeOfBallsHelper(int[] position, int pivot, int m) {
        int countOfBalls = 1;
        int lastPlacedOfBalls = position[0];

        for(int i = 1; i < position.length && countOfBalls < m; i++) {
            int currentEl = position[i];
            if(currentEl - lastPlacedOfBalls >= pivot) {
                countOfBalls++;
                lastPlacedOfBalls = currentEl;
            }
        }

        return countOfBalls == m;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 10};
        int result = maxDistance(arr, 3);
        System.out.println(result);
    }
}
