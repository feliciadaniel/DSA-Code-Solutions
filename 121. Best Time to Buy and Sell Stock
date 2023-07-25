class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0; // If the array is empty or null, there's no profit possible.
        }
        
        int minPrice = prices[0]; // Initialize the minimum price to the first element.
        int maxProfit = 0; // Initialize the maximum profit to 0.
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price.
            } else {
                int profit = prices[i] - minPrice; // Calculate the profit if we sell at the current price.
                maxProfit = Math.max(maxProfit, profit); // Update the maximum profit if needed.
            }
        }
        
        return maxProfit;
    }
}
