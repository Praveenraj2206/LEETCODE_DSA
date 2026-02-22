class Solution 
{
    public int arrangeCoins(int n) 
    {
        long start=0;
        long end=n;
        while (start <= end)
        {
            long k = start+(end-start)/2;
            long curr = k*(k+1)/2;
            if (n == curr)
                return (int) k;
            if (n<curr)
                end = k-1;
            else
                start = k+1;
        }
        return (int)end;
    }
}