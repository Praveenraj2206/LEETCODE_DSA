class Solution 
{
    public long countCommas(long n) 
    {
        if(n<=999)
            return 0;
        long total_comma = 0;
        long count_comma = 1;
        long start = 1000;
        while(start <= n)
        {
            long end = Math.min(n,start*1000-1);
            long num_range = end - start+1;
            total_comma += num_range*count_comma;
            start *= 1000;
            count_comma++;
        }
        return total_comma;
    }
}