class Solution 
{
    public int arrangeCoins(int n) 
    {
        if (n==1)
            return 1;
        int coins_left = n;
        int i;
        for(i=1;i<n;i++)
        {
            if(coins_left<i)
                return i-1;
            coins_left += (-1* i);
        }
        return i-1;
    }
}