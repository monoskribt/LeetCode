package Easy;

public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int costSize = cost.length;
        int[] sumArray = new int[costSize + 1];

        for(int i = 2; i <= costSize; i++) {
            sumArray[i] = Math.min((sumArray[i-1] + cost[i-1]), (sumArray[i-2] + cost[i-2]));
        }

        return sumArray[costSize];
    }

    public static void main(String[] args) {
        int[] cost = new int[] {10,15,20};
        int result = minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
