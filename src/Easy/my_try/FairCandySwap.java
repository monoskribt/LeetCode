package Easy.my_try;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] helperArr = new int[aliceSizes.length + bobSizes.length / 2];
        int sum = 0;

        for(int elFromAlice : aliceSizes) {
            for(int elFromBob : bobSizes) {
                sum += elFromAlice + elFromBob;
            }
        }
        return helperArr;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = fairCandySwap(arr1, arr2);
        for(int el : result) {
            System.out.print(el + " ");
        }
    }
}
