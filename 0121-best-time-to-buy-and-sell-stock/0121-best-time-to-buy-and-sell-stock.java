class Solution 
{
    public int maxProfit(int[] nums) 
    {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min = nums[i];
            int profit = nums[i]-min;
            if(max<profit)
                max = profit;
        }
        return max;
    }
}