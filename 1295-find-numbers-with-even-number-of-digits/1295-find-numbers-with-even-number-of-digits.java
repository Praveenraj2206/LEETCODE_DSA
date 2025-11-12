class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int count = 0;
        for(int num :nums)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    private boolean even(int num)
        {
            int digits = 0;
            while(num>0)
            {
                num /= 10;
                digits++;
            }
            return digits%2 == 0;
        }
}