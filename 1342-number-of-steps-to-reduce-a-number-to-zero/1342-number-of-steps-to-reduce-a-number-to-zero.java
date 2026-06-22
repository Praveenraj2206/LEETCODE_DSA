class Solution 
{
    int count=0;
    public int numberOfSteps(int num) 
    {
        solve(num);
        return count;
    }
    public int solve(int n)
    {
        if(n==0)
            return 0;
        if(n%2 == 0)
        {
            count++;
            n /= 2;
        }
        else
        {
            count++;
            n -= 1;
        }
        return solve(n);
    }
}