package Easy;

import java.util.Arrays;

public class FairCandySwap {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumOfArrayAlice = Arrays.stream(aliceSizes).sum();
        int sumOfArrayBob = Arrays.stream(bobSizes).sum();

        int difference = (sumOfArrayAlice - sumOfArrayBob) / 2;

        Arrays.sort(bobSizes);

        for(Integer elOfAlice : aliceSizes) {
            int elOfBob = elOfAlice - difference;

            int left = 0;
            int right = bobSizes.length - 1;

            while (left <= right) {
                int pivot = (left + right) / 2;

                if(bobSizes[pivot] == elOfBob) {
                    return new int[]{elOfAlice, elOfBob};
                }
                else if(bobSizes[pivot] > elOfBob) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return new int[]{0, 0};
    }
}
