class Solution 
{
    public int sumBase(int n, int k) 
    {
        int digit_sum = 0;
        while(n>0)
        {
            int digit = n%k;
            digit_sum += digit;
            n /= k;
        }
        return digit_sum;
    }
}