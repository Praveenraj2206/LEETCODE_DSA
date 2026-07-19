class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
                min=prices[i];
            int profit=prices[i]-min;
            if(max<profit)
                max=profit;
        }
        return max;
    }
}