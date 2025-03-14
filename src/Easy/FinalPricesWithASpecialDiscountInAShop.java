package Easy;

public class FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length; i++) {
            int elementI = prices[i];

            for(int j = i + 1; j < prices.length; j++) {
                int elementJ = prices[j];
                if(elementJ <= elementI) {
                    prices[i] = elementI - elementJ;
                    break;
                }
            }
        }
        return prices;
    }
}
