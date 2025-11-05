class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int richest=0;
        for(int i = 0;i < accounts.length;i++)
        {
            int x=0;
            for(int j = 0;j < accounts[i].length;j++)
            {
                x += accounts[i][j];
            }
            if (x>richest)
            {
                richest = x;
            }
        }
        return richest;
    }
}