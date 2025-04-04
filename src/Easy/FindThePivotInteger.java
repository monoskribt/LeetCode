package Easy;

public class FindThePivotInteger {

    public static int pivotInteger(int n) {
        for (int mid = 1; mid <= n; mid++) {
            int leftSum = getSum(1, mid);
            int rightSum = getSum(mid, n);

            if (leftSum == rightSum) {
                return mid;
            }
        }
        return -1;
    }

    private static int getSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = pivotInteger(8);
        System.out.println(result);
    }
}
