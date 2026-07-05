class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0, count = 0;
        for (int num : nums) 
        {
            if (num == 1)
                max = maxi(max, ++count);
            else
                count = 0;
        }
        return max;
    }
    public int maxi(int a,int b)
    {
        if(a>b)
            return a;
        return b;
    }
}