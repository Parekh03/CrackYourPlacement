class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxP = 0;

        for(int i=1; i<prices.length; i++){
            int profit = prices[i] - minBuy;
            maxP = Math.max(maxP, profit);
            minBuy = Math.min(minBuy, prices[i]);
        }

        return maxP;
    }
}
