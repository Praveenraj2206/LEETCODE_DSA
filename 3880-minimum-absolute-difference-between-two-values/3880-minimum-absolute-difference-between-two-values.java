class Solution 
{
    public int minAbsoluteDifference(int[] nums) 
    {
        int lastOne = -1;
        int lastTwo = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 1) 
            {
                lastOne = i;
                if (lastTwo != -1) 
                    minDiff = Math.min(minDiff, Math.abs(i - lastTwo));
            } 
            else if (nums[i] == 2) 
            {
                lastTwo = i;
                if (lastOne != -1) 
                    minDiff = Math.min(minDiff, Math.abs(i - lastOne));
            }
        }

        if (minDiff == Integer.MAX_VALUE)
            return -1;
        return minDiff;
    }
}