package LeetCode.Array;

public class maxProfit {


    public static int profit(int[] prices){
        int min = Integer.MAX_VALUE;
        int current;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            current= prices[i];
            if( current < min){
                min = current;
            }
            if( current > min){
                profit = Math.max(profit, (current - min));
            }
        }
        return profit;
    }


    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0; // No profit can be made with less than 2 prices
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price if a lower price is found
            } else {
                int potentialProfit = prices[i] - minPrice; // Calculate potential profit
                maxProfit = Math.max(maxProfit, potentialProfit); // Update maxProfit if a higher profit is found
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices = {1,2};
        int [] prices1 = {7,1,5,3,6,4};

        System.out.println(profit(prices1));

    }
}
