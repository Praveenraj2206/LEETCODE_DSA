class Solution 
{
    public int hammingDistance(int x, int y) 
    {
        int count=0;
        while(x!=0 || y!=0)
        {
            int res = x^y;
            if ((res&1) == 1)
                count++;
            x=x>>1;
            y=y>>1;
        }
        return count;
    }
}