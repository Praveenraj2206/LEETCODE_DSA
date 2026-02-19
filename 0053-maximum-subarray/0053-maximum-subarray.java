class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int currSum = nums[0],maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) 
        {
            currSum = maxi(nums[i], currSum + nums[i]);
            maxSum = maxi(maxSum, currSum);
        }
        return maxSum;
    }
    public int maxi(int a,int b)
    {
        return a>b?a:b;
    }
}
