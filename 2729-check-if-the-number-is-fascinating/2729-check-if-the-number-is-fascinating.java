class Solution 
{
    public boolean isFascinating(int n) 
    {
        Set<Integer> set=new HashSet<>();
        int x=n;
        for(int i=1;i<=3;i++)
        {
            x = i*n;
            while(x > 0)
            {
                int rem=x%10;
                if(rem==0)
                    return false;
                if(set.contains(rem))
                    return false;
                set.add(rem);
                x /= 10;
            }
        }
        return true;
    }
}