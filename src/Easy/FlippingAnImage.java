package Easy;

public class FlippingAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image) {
            reverseArray(row);
            invertArray(row);
        }

        return image;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    private static void invertArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] testMatrix = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        flipAndInvertImage(testMatrix);

        System.out.println(testMatrix);

    }
}
