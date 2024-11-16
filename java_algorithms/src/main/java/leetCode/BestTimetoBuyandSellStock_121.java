package leetCode;

public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args) {
        int[] data = {7,1,5,3,6,4};
        System.out.println(maxProfit(data));
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int currentProfit = 0;
        for(int i = 0; i < prices.length ; i++) {
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            if(buyPrice < prices[i] && prices[i] - buyPrice > currentProfit) {
                currentProfit = prices[i] - buyPrice;
            }
        }
        return currentProfit;
    }
}
