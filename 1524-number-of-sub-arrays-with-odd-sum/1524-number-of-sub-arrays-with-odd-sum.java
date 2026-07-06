class Solution 
{
    public int numOfSubarrays(int[] arr) 
    {
        int MOD=1000000007;
        int count = 0,sum = 0,odd = 0,even = 1;
        for(int num : arr)
        {
            sum+=num;
            if(sum%2 != 0)
            {
                count = (count+even)%MOD;
                odd++;
            }
            else
            {
                count = (count+odd)%MOD;
                even++; 
            }
        }
        return count;
    }
}