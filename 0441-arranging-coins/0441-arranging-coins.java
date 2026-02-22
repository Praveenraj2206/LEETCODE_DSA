class Solution 
{
    public int arrangeCoins(int n) 
    {
        long start = 0;
        long end = n;
        while (start <= end)
        {
            long k = start+(end-start)/2;
            long curr = k*(k+1)/2;
            if (n<curr)
                end = k -1;
            else if (n>curr)
                start = k +1;
            else
                return (int)k;
        }
        return (int)end;
    }
}
