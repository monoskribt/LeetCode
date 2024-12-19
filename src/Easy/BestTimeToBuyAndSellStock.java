package Easy;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {

        int minNumber = Integer.MAX_VALUE;


        List<Integer> list = new ArrayList<>();

        for(int i=0; i<prices.length - 1; i++) {

            if(prices[i] < minNumber) {
                minNumber = prices[i];
                int maxNumber = Integer.MIN_VALUE;

                for(int j=i+1; j<prices.length; j++) {

                    if(prices[j] > maxNumber || prices[j] == maxNumber) {
                        maxNumber = prices[j];
                        int profit = maxNumber - minNumber;
                        if(profit>=0 && !list.contains(profit)) {
                            list.add(profit);
                        }
                    }
                }
            }
        }

        int result = list.stream().max(Integer::compare).orElse(0);
        return result;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 2};
        int[] prices4 = {3,3,5,0,0,3,1,4};
        int result = maxProfit(prices3);
        System.out.println(result);
    }
}
