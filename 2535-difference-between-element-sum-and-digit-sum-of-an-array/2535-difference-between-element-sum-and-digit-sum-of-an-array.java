class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int sum_1=0;
        int sum_2=0;
        int i=0;
        while(i<nums.length)
            sum_1 += nums[i++];
        i=0;
        while(i<nums.length)
        {
            if(nums[i]>9)
            {
                int x=nums[i];
                while(x>0)
                {
                    sum_2 = sum_2 + (x%10);
                    x /= 10;
                }
            }
            else
                sum_2 += nums[i];
            i++;
        }
        return Math.abs(sum_1 - sum_2);
    }
}