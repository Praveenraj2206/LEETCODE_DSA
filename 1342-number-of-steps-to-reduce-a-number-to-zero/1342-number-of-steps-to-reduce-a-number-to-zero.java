class Solution 
{
    public int numberOfSteps(int num) 
    {
        return solve(num,0);
    }
    public int solve(int n,int count)
    {
        if(n==0)
            return count;
        if(n%2 == 0)
            return solve(n/2,count+1);
        else
            return solve(n-1,count+1);
    }
}