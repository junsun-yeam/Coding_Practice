class Solution {
    public int maxProfit(int[] prices) {
        int minY = prices[0]; int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            minY = Math.min(minY, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minY);
        }
        return maxProfit;
        
    }
}