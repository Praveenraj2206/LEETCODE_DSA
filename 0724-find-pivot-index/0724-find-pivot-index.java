class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int total_sum = 0,left_sum = 0;
        for(int i=0;i<n;i++)
        {   
            total_sum = total_sum + nums[i];    
        }
        int i;
        for(i=0;i<n;i++)
        {   
            total_sum = total_sum - nums[i];
            if(total_sum == left_sum)
            {
                return i;
            }
            else
            {
                left_sum = left_sum + nums[i];
            }
        }
        return -1;
    }
}