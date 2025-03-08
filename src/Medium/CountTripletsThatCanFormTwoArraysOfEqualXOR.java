package Medium;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {

    public static int countTriplets(int[] arr) {
        int length = arr.length;
        int result = 0;

        for(int i = 0; i < length; i++) {
            int xor = 0;

            for(int k = i; k < length; k++) {
                xor ^= arr[k];

                if(xor == 0 && k > i) {
                    result += (k - i);
                }
            }
        }
        return result;
    }
}
