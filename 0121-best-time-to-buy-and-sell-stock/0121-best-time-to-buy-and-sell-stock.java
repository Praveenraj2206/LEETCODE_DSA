class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int price = 0;price < prices.length;price++)
        {
            if (prices[price] < min_price)
                min_price = prices[price];
            int profit = prices[price] - min_price;
            if (profit > max_profit)
                max_profit = profit;
        }   
        return max_profit;
    }
}