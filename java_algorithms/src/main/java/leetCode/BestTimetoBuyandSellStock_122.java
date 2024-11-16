package leetCode;

public class BestTimetoBuyandSellStock_122 {
    public static void main(String[] args) {
        int[] data = {7,1,5,3,6,4};
        System.out.println(maxProfit(data));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        int price = prices[0];
        for(int i = 0; i < prices.length; i++) {
            if(price > prices[i]) {
                price = prices[i];
            }
            if(price < prices[i]) {
                sum = sum + (prices[i] - price);
                price = prices[i];
            }
        }
        return sum;
    }
}
